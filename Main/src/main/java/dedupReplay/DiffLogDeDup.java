package dedupReplay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiffLogDeDup {

    public static HashMap<String, ArrayList<DiffInfo>> dedup(File resultDir) throws IOException {

        ArrayList<DiffInfo> allDiffs = new ArrayList<>();

        File[] directories = resultDir.listFiles(File::isDirectory);
        for (File file : directories) {

            Path diffPath = Paths.get(file.getAbsolutePath(), DeDupReplayConfig.projName, DeDupReplayConfig.logFileName);

            List<StringBuilder> diffMessages = parseAllDiffMessage(diffPath.toFile());
            allDiffs.addAll(parseEachDiff(file.getAbsolutePath(), diffMessages));
        }

        return dedupDiffInos(allDiffs);
    }

    public static HashMap<String, ArrayList<DiffInfo>> dedupDiffInos(ArrayList<DiffInfo> allDiffs) {

        HashMap<String, ArrayList<DiffInfo>> diffMap = new HashMap<>();
        for (DiffInfo eachDiff : allDiffs) {

            if (diffMap.keySet().contains(eachDiff.getFailureStr())) {
                diffMap.get(eachDiff.getFailureStr()).add(eachDiff);
            } else {
                ArrayList<DiffInfo> tmp = new ArrayList<>();
                tmp.add(eachDiff);
                diffMap.put(eachDiff.getFailureStr(), tmp);
            }
        }
        return diffMap;
    }

    /**
     * @param diffMessages
     * @return
     */
    public static ArrayList<DiffInfo> parseEachDiff(String filePath, List<StringBuilder> diffMessages) {

        ArrayList<DiffInfo> diffInfos = new ArrayList<>();

        for (StringBuilder diff : diffMessages) {

            String failurePattern = "";
            String[] lines = diff.toString().split("\n");
            DiffInfo diffInfo = new DiffInfo();

            TreeMap<String, String> sortedMap = new TreeMap<>();

            ReplayInfo replayInfo = null;
            for (String line : lines) {
                if (line.startsWith("Difference found:")) {
                    //01 set Diff class
                    String diffClassName = line.substring(line.lastIndexOf("-") + 1);
                    diffInfo.setDiffClass(diffClassName);
                } else if (line.startsWith("======================")) {
                    //02 set vm options
                    String pattern = "^=+(.*?)=+$";
                    String result = line.replaceAll(pattern, "$1");

                    //openjdk8@hotspot@/home/JVMs/openjdk8/OpenJDK8U-jre_x64_linux_hotspot_8u392b08/bin/java@-XX:+UnlockExperimentalVMOptions -XX:CompileThreshold=10 -XX:+IgnoreUnrecognizedVMOptions
                    String[] infos = result.split("@");

                    try {
                        replayInfo = new ReplayInfo();
                        replayInfo.setJdkVersion(infos[0]);
                        replayInfo.setJvmImpl(infos[1]);
                        replayInfo.setJvmCmd(infos[2]);
                        replayInfo.setVmOptions(infos[3]);

                        diffInfo.addReplayInfo(replayInfo);
                    } catch (Exception e) {

                        System.out.println(result);
                        e.printStackTrace();
                    }

                } else if (line.startsWith("Normal Output Inconsistent")) {
                    //
//                    diffInfo.setFailureStr("ValueInconsistent");
                    failurePattern = "ValueInconsistent";
                } else if (line.startsWith("Error Size Inconsistent")
                        || line.contains("Error Inconsistent")
                        || line.contains("Exception Inconsistent")
                        || line.contains("Failure Inconsistent")){

                    Pattern pattern = Pattern.compile("\\[(.*?)]");
                    Matcher matcher = pattern.matcher(line);

                    if (matcher.find()) {
                        //ServiceConfigurationError, ArithmeticException
                        String result = matcher.group(1);

                        if (replayInfo != null) {
                            String key = replayInfo.getJdkVersion() + replayInfo.getJvmImpl();
                            String value = "";
                            if (result.equals("")) {
                                value = "[]";
                            } else {
                                value = String.join("-", trimArrayValues(result.split(",")));
                                value =  "[" + value + "]";
                            }
                            sortedMap.put(key, value);
                        }
                    }
                }  else {
                    //do nothing
                }
            }
            if (!failurePattern.equals("ValueInconsistent")) {
                for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                    failurePattern += entry.getValue();
                }
            }
            diffInfo.setFailureStr(failurePattern);
            diffInfo.setDir(filePath);
            diffInfos.add(diffInfo);
        }
        return diffInfos;
    }

    private static String[] trimArrayValues(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }

    public static List<StringBuilder> parseAllDiffMessage(File diffLog) throws IOException {

        List<StringBuilder> diffs = new ArrayList<>();
        if (!diffLog.exists()) {
            return diffs;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(diffLog));
        String line = bufferedReader.readLine();
        while (line != null) {
            if (line.contains("Difference found:")) {
                diffs.add(new StringBuilder(""));
            }
            diffs.get(diffs.size() - 1).append(line).append("\n");
            line = bufferedReader.readLine();
        }
        return diffs;
    }

    public static class ReplayInfo {

        public String vmOptions;
        public String jvmImpl;
        public String jvmCmd;
        public String jdkVersion;

        public ReplayInfo() {
        }

        public ReplayInfo(String vmOptions, String jvmImpl, String jvmCmd, String jdkVersion) {
            this.vmOptions = vmOptions;
            this.jvmImpl = jvmImpl;
            this.jvmCmd = jvmCmd;
            this.jdkVersion = jdkVersion;
        }

        public String getVmOptions() {
            return vmOptions;
        }

        public void setVmOptions(String vmOptions) {
            this.vmOptions = vmOptions;
        }

        public String getJvmImpl() {
            return jvmImpl;
        }

        public void setJvmImpl(String jvmImpl) {
            this.jvmImpl = jvmImpl;
        }

        public String getJvmCmd() {
            return jvmCmd;
        }

        public void setJvmCmd(String jvmCmd) {
            this.jvmCmd = jvmCmd;
        }

        public String getJdkVersion() {
            return jdkVersion;
        }

        public void setJdkVersion(String jdkVersion) {
            this.jdkVersion = jdkVersion;
        }
    }

    public static class DiffInfo {

        public String diffClass;
        public String failureStr;
        public ArrayList<ReplayInfo> replayInfos = new ArrayList<>();
        public String dir;

        public DiffInfo() {
        }

        public DiffInfo(String diffClass, String failureStr) {
            this.diffClass = diffClass;
            this.failureStr = failureStr;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getFailureStr() {
            return failureStr;
        }

        public void setFailureStr(String failureStr) {
            this.failureStr = failureStr;
        }

        public String getDiffClass() {
            return diffClass;
        }

        public void setDiffClass(String diffClass) {
            this.diffClass = diffClass;
        }

        public ArrayList<ReplayInfo> getReplayInfos() {
            return replayInfos;
        }

        public void addReplayInfo(ReplayInfo replayInfo) {
            replayInfos.add(replayInfo);
        }

        @Override
        public String toString() {
            return "[" + diffClass + "]";
        }
    }
}
