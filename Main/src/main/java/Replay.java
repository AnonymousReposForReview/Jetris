
import config.ExecutionConfig;
import config.ExecutionPlatform;
import dedupReplay.DeDupReplayConfig;
import dedupReplay.DiffLogDeDup;
import execute.BenchmarkInfo;
import execute.JvmInfo;
import execute.analyzer.DiffCore;
import execute.analyzer.JDKAnalyzer;
import execute.executor.ExecutorHelper;
import execute.executor.JIT.JITExecutor;
import execute.executor.JIT.JvmOutput;
import execute.loader.JITLoader;
import utils.Status;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Replay {

    public static void main(String[] args) throws IOException {

        Status.argsParser(args);
        DeDupReplayConfig.projName = ExecutionConfig.TESTED_BENCHMARK;

        if (DeDupReplayConfig.className.endsWith(".class")) {
            DeDupReplayConfig.className = DeDupReplayConfig.className.replace(".class", "");
        }

        File result = new File(DeDupReplayConfig.resultPath);
        HashMap<String, ArrayList<DiffLogDeDup.DiffInfo>> diffMap = DiffLogDeDup.dedup(result);

        System.out.println(ExecutionPlatform.getInstance());
        ArrayList<JvmInfo> jvmCmds = JITLoader.getInstance().loadJvms();
        for (JvmInfo jvmCmd : jvmCmds) {
            System.out.println(jvmCmd);
        }
        BenchmarkInfo targetProject = JITLoader.getInstance().loadBenchmarkWithGivenPath(ExecutionConfig.TESTED_SOOTOUTPUT_HOME, ExecutionConfig.TESTED_BENCHMARK, null);

        ArrayList<DiffLogDeDup.DiffInfo> replayClasses = getTargetDiffInfo(diffMap);
        if (replayClasses.size() == 0) {
            throw new RuntimeException("Can not find " + DeDupReplayConfig.className);
        } else {
            for (DiffLogDeDup.DiffInfo replayClass : replayClasses) {
                replay(jvmCmds, targetProject, replayClass);
            }
        }
    }

    public static void replay(ArrayList<JvmInfo> jvmCmds, BenchmarkInfo targetProject, DiffLogDeDup.DiffInfo replayClass) {

        String className = replayClass.getDiffClass();
        String packageName = className.substring(0, className.lastIndexOf("_"));
        String classPath = replayClass.getDir() + ExecutionPlatform.FILE_SEPARATOR + "diffClasses"
                + ExecutionPlatform.FILE_SEPARATOR + packageName
                + ExecutionPlatform.FILE_SEPARATOR + className;

        String targetFilePath = targetProject.getSrcClassPath();
        if (className.contains(".")){

            String seedClassname = className.substring(0, className.lastIndexOf("_"));
            String package_class = seedClassname.replace(".", "/");
            targetFilePath = targetFilePath + ExecutionPlatform.FILE_SEPARATOR + package_class + ".class";
        } else {
            String seedClassname = className.substring(0, className.lastIndexOf("_"));
            targetFilePath = targetFilePath + ExecutionPlatform.FILE_SEPARATOR + seedClassname + ".class";
        }
        System.out.println(targetFilePath);
        try {

            File sourceFile = new File(classPath);
            File targetFile = new File(targetFilePath);
            Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        execute(jvmCmds, targetProject, replayClass);
    }

    public static ArrayList<DiffLogDeDup.DiffInfo> getTargetDiffInfo(HashMap<String, ArrayList<DiffLogDeDup.DiffInfo>> diffMap) {

        ArrayList<DiffLogDeDup.DiffInfo> replayClasses = new ArrayList<>();
        for (String s : diffMap.keySet()) {
            for (DiffLogDeDup.DiffInfo diffInfo : diffMap.get(s)) {
                if (diffInfo.getDiffClass().equals(DeDupReplayConfig.className + DeDupReplayConfig.classSuffix)) {
                    replayClasses.add(diffInfo);
                }
            }
        }
        return replayClasses;
    }

    public static void execute(ArrayList<JvmInfo> jvmCmds, BenchmarkInfo targetProject, DiffLogDeDup.DiffInfo replayClass){

        boolean debug = true;

        String className = DeDupReplayConfig.className.substring(0, DeDupReplayConfig.className.lastIndexOf("_"));
        HashMap<String, JvmOutput> results = new HashMap<>();
        for (DiffLogDeDup.ReplayInfo replayInfo : replayClass.getReplayInfos()) {

            JvmInfo jvm = getJVMInfo(jvmCmds, replayInfo);
            if (jvm != null) {

                ArrayList<String> options = null;
                if (replayInfo.getVmOptions() != null) {
                    options = new ArrayList<>();
                    options.addAll(Arrays.asList(replayInfo.getVmOptions().split(" ")));
                }
                String cmdExecutor = ExecutorHelper.assembleJavaCmd(jvm.getJavaCmd(),
                        options,
                        targetProject.getpClassPath(),
                        className,
                        false,
                        new String[]{});
                System.out.println(cmdExecutor);
                String jvmId = jvm.getJvmId() != null ? jvm.getJvmId() : jvm.getJvmName();
                Thread test = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        JITExecutor.getInstance().execute(cmdExecutor);
                    }
                });
                test.start();
                try {
                    TimeUnit.SECONDS.timedJoin(test, ExecutionConfig.CLASS_MAX_RUNTIME);
                    JITExecutor.getInstance().shutDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (JITExecutor.getInstance().getCurrentOutput() != null){
                    System.out.println(JITExecutor.getInstance().getCurrentOutput().getOutput());
                    results.put(jvmId, JITExecutor.getInstance().getCurrentOutput());
                } else {
                    System.out.println("TIMEOUT");
                    results.put(jvmId, new JvmOutput(""));
                }
            }
        }
        DiffCore diff = JDKAnalyzer.getInstance().analysis(className, results);
        if (diff != null){
            ExecutorHelper.logJvmOutput("Main", className, diff ,results);
        }
    }

    public static JvmInfo getJVMInfo(ArrayList<JvmInfo> jvmCmds, DiffLogDeDup.ReplayInfo replayInfo) {

        for (JvmInfo jvmCmd : jvmCmds) {
            if (jvmCmd.getJvmName().equals(replayInfo.getJvmImpl())
                    && jvmCmd.getVersion().equals(replayInfo.getJdkVersion())) {
                return jvmCmd;
            }
        }
        return null;
    }
}
