package debug;

import codegen.Generator;
import codegen.blocks.*;
import codegen.operands.OperandGenerator;
import codegen.providers.StaticMethodProvider;
import codegen.providers.TypeProvider;
import config.*;
import core.SeedInfo;
import execute.*;
import execute.executor.JIT.JITExecutor;
import execute.loader.JITLoader;
import soot.*;
import soot.options.Options;
import utils.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Replay {

    public static void main(String[] args) throws IOException {

        ExecutionConfig.useVMOptions = Status.useVMOptions;
        Status.argsParser(args);
        Status.printGlobalStatus();

        ExecutionConfig.TESTED_BENCHMARK_HOME = "HotspotTests-Java";
        Status.timeStamp = "1692553185";
        String targetClass = "SourceDebugExtension_0101@1692553656478.class";
        Status.currentSeed = Long.parseLong("-2423152049982177335");

        Status.mutationHistoryPath = "." + ExecutionPlatform.FILE_SEPARATOR + "03results" +
                ExecutionPlatform.FILE_SEPARATOR + Status.timeStamp +
                ExecutionPlatform.FILE_SEPARATOR + "classHistory";

        // Testing platform
        System.out.println(ExecutionPlatform.getInstance());
        // load JVMs
        ArrayList<JvmInfo> jvmCmds = JITLoader.getInstance().loadJvms();
        // load projects
        BenchmarkInfo originProject = JITLoader.getInstance().loadBenchmarkWithGivenPath("02Benchmarks", ExecutionConfig.TESTED_BENCHMARK_HOME, null);
        BenchmarkInfo targetProject = JITLoader.getInstance().loadBenchmarkWithGivenPath("sootOutput", ExecutionConfig.TESTED_BENCHMARK_HOME, null);
        List<String> seedClasses = originProject.getApplicationClasses();
        MainHelper.restoreBadClasses(seedClasses, originProject, targetProject);
        targetProject.setApplicationClasses(originProject.getApplicationClasses());
//        seeds = MainHelper.initialSeedsWithType(originProject.getApplicationClasses(), targetProject.getSrcClassPath(), false, Status.mutationHistoryPath);

        /**
         * JVM
         */
        for (JvmInfo jvmCmd : jvmCmds) {
            System.out.println(jvmCmd);
        }
        /**
         * Project
         */
        System.out.println(originProject);
        System.out.println(targetProject);

        ClassUtils.initReplaySootEnvWithClassPath(targetProject.getpClassPath());
        ClassUtils.set_output_path(targetProject.getSrcClassPath());

        RandomManager.setRandomSeed(Status.initialSeed);
        JITExecutor.getInstance().enableDebugMode();

        initChecksumClass(originProject, targetProject);

        TypeProvider.loadRefTypes();
        StaticMethodProvider.loadStaticMethods();

        SeedInfo seed = parseTargetClass(targetProject, targetClass);

        try {
            String classFileFolder = Status.mutationHistoryPath + ExecutionPlatform.FILE_SEPARATOR + seed.getOriginClassName();
            seed.storeToCoverOriginClass();
            ClassInfo clazz = ClassUtils.loadClassInfo(seed.getOriginClassName());
            List<SootMethod> sootMethods = clazz.getSootClass().getMethods();

//            CFGGenerator.printCFG(clazz.getSootClass());

            for (SootMethod sootMethod : sootMethods) {
                if (!sootMethod.isAbstract()) {
                    sootMethod.retrieveActiveBody();
                }
            }
            RandomManager.updateSeed(Status.currentSeed);
            List<SootMethod> candidates;
            if (ExecutionConfig.TESTED_BENCHMARK_HOME.equals("Templates")) {
                candidates = sootMethods.stream().filter(m -> m.getName().contains("opt")).collect(Collectors.toList());
            } else {
                candidates = sootMethods.stream().filter(m -> !m.isStaticInitializer() && !m.isConstructor() && !m.isAbstract()).collect(Collectors.toList());
            }
            SootMethod method = candidates.get(MainRandom.nextChoice(candidates.size()));
            List<Local> originLocals = new ArrayList<>(method.retrieveActiveBody().getLocals());
            try {
                fuzzing(clazz, method);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 获取插入的新local
            List<Local> newLocals = new ArrayList<>(method.retrieveActiveBody().getLocals());
            newLocals.removeAll(originLocals);
            // 更新checksum
            ChecksumHelper.updateCheckSumStmtAfterLastWrite(clazz.getSootClass(), method.retrieveActiveBody(), newLocals);

            if (ClassUtils.saveClass(clazz.getSootClass(), Options.output_format_class)) {

                seed.mutationTimesIncrease();
                SeedInfo newClass = new SeedInfo(seed.getOriginClassName(),
                        seed.getOriginClassPath(),
                        seed.generateMutateClassFilename(),
                        classFileFolder,
                        seed.isJunit(),
                        seed.getMutationOrder() + 1,
                        0);

                //save to history
                newClass.saveSootClassToFile(clazz.getSootClass());
                CFGGenerator.printCFG(clazz.getSootClass());
                //successful saved
                if (!JITExecutor.getInstance().dtSingleClassInProj(jvmCmds, targetProject, newClass.getOriginClassName(), newClass.getClassName())) {
                    Status.updateStatus(seed.getClassName(), newClass.getClassName(), "Normal&Consistent");
                } else {
                    if (JITExecutor.getInstance().isDiffFound()) {
                        String diffClassFolder = Status.diffClassPath + ExecutionPlatform.FILE_SEPARATOR + newClass.getOriginClassName();
                        MainHelper.createFolderIfNotExist(diffClassFolder);
                        //save to diffClasses
                        MainHelper.saveSootClassToTargetPath(clazz.getSootClass(), diffClassFolder + ExecutionPlatform.FILE_SEPARATOR + newClass.getClassName());
                        Status.updateStatus(seed.getClassName(), newClass.getClassName(), "DifferenceFound");
                    } else {
                        Status.updateStatus(seed.getClassName(), newClass.getClassName(), "Broken&Consistent");
                    }
                }
            } else {
                Status.updateStatus(seed.getClassName(), "GenerationFailed", "GenerationFailed");
            }
            Scene.v().removeClass(clazz.getSootClass());
        } catch (Exception e) {
            e.printStackTrace();
            Status.updateStatus(seed.getClassName(), "GenerationFailed", "GenerationFailed");
        }
    }

    public static SeedInfo parseTargetClass(BenchmarkInfo targetProject, String className) {

        String classInfo = className.split("@")[0];
        String[] infos = classInfo.split("_");
        String originClassName = infos[0];
        int mutationOrder = Integer.parseInt(infos[1].substring(0,2));
        int mutationTime = Integer.parseInt(infos[1].substring(2));
        String classPath = targetProject.getSrcClassPath() + ExecutionPlatform.FILE_SEPARATOR +
                originClassName.replace(".", ExecutionPlatform.FILE_SEPARATOR) + ".class";
        String pathToClass = Status.mutationHistoryPath + ExecutionPlatform.FILE_SEPARATOR +
                originClassName + ExecutionPlatform.FILE_SEPARATOR + className;
        return new SeedInfo(originClassName, classPath, className, pathToClass, false, mutationOrder, mutationTime);
    }

    public static void fuzzing(ClassInfo clazz, SootMethod sootMethod){

        //generate new fields
        for (int i = 0; i < MainRandom.nextChoice(FuzzingConfig.MAX_FIELD_NUM); i++) {
            OperandGenerator.getInstance().addClassField(clazz);
        }
//        Status.fuzzingRound = 8;
        for (int i = 0; i < FuzzingConfig.MAX_FUZZ_STEP; i++) {

            ExecutionGlobal.debugInfo = i;
            System.out.println("fuzzing round: " + i);// bug: i == 5
            BasicBlock block = Generator.nextBlock(clazz, sootMethod.getSignature());
            System.out.println("Block: " + block);
            if (block == null) continue;
            blockInsertion(clazz, sootMethod, block, false);
            if (block instanceof FuncBlock) {
                if (((FuncBlock) block).getMethod() != null) {
                    int nested = MainRandom.nextChoice(FuzzingConfig.MAX_NESTED_SIZE);
                    for (int i1 = 0; i1 < nested; i1++) {
                        BasicBlock nestedBlock = Generator.nextBlock(clazz, ((FuncBlock) block).getMethod().getSignature(), block.getContents());
                        System.out.println("       SubBlock: " + nestedBlock);
                        blockInsertion(clazz, ((FuncBlock) block).getMethod(), nestedBlock, true);
                    }
                }
            } else if ( ! (block instanceof StmtBlock) && !(block instanceof SwitchBlock)) {
                int nested = MainRandom.nextChoice(FuzzingConfig.MAX_NESTED_SIZE);
                for (int i1 = 0; i1 < nested; i1++) {
                    BasicBlock nestedBlock = Generator.nextBlock(clazz, sootMethod.getSignature(), block.getContents());
                    System.out.println("       SubBlock: " + nestedBlock);
                    blockInsertion(clazz, sootMethod, nestedBlock, true);
                }
            }
        }
    }

    public static void blockInsertion(ClassInfo clazz, SootMethod sootMethod, BasicBlock block, boolean nested) {

        if (block == null) return;
        block.insertBlock(clazz, sootMethod);
    }

    public static void initChecksumClass(BenchmarkInfo originProject, BenchmarkInfo targetProject) {
        ChecksumHelper.createChecksumFile(originProject.getSrcClassPath());
        ChecksumHelper.createChecksumFile(targetProject.getSrcClassPath());
        SootClass check_sum_class = ClassUtils.loadClass("JITFuzzing.Check");
    }
}
