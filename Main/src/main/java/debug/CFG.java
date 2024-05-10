package debug;

import config.ExecutionPlatform;
import execute.BenchmarkInfo;
import execute.loader.JITLoader;
import soot.Scene;
import soot.SootClass;
import utils.CFGGenerator;
import utils.ClassUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;

public class CFG {

    public static String projectName = "Templates";
    public static String historyPath = "03results/1683725822/classHistory";
    public static String projectPath = "sootOutput";
    public static String cfgOutputPath = "04cfgOutput";
    public static String targetClass = "demo1";

    public static void main(String[] args) {

        BenchmarkInfo project = JITLoader.getInstance().loadBenchmarkWithGivenPath(projectPath, projectName, null);
        ClassUtils.initSootEnvWithClassPath(project.getpClassPath());
        ClassUtils.set_output_path(project.getSrcClassPath());

        ArrayList<File> classFiles = listHistoryClasses(historyPath, targetClass);

        copyHistoryClassToDir(classFiles, project);
        System.out.println(project);
    }
    public static void copyHistoryClassToDir(ArrayList<File> classFiles, BenchmarkInfo project) {

        String cfgRootPath = cfgOutputPath + ExecutionPlatform.FILE_SEPARATOR + targetClass;
        File cfgFile = new File(cfgRootPath);
        if (!cfgFile.exists()) {
            cfgFile.mkdirs();
        }
        for (File classFile : classFiles) {

            String historyClassName = classFile.getName();
            String originClassname = historyClassName.substring(0, historyClassName.lastIndexOf("_"));

            String targetFilePath = project.getSrcClassPath();
            if (originClassname.contains(".")){
                String package_class = originClassname.replace(".", ExecutionPlatform.FILE_SEPARATOR);
                targetFilePath = targetFilePath + ExecutionPlatform.FILE_SEPARATOR + package_class + ".class";
            } else {
                targetFilePath = targetFilePath + ExecutionPlatform.FILE_SEPARATOR + originClassname + ".class";
            }
            try {
                File targetFile = new File(targetFilePath);
                Files.copy(classFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            SootClass sootClass = ClassUtils.loadClass(originClassname);

            String thisCfgPath = cfgRootPath + ExecutionPlatform.FILE_SEPARATOR + historyClassName.replace(".class", "");
            File thisCfgFile = new File(thisCfgPath);
            if (!thisCfgFile.exists()) {
                thisCfgFile.mkdirs();
            }
            CFGGenerator.printCFG(sootClass, thisCfgFile);
            Scene.v().removeClass(sootClass);
        }
    }

    public static ArrayList<File> listHistoryClasses(String historyPath, String targetClass) {

        ArrayList<File> classFiles = new ArrayList<>();

        File historyFile = new File(historyPath);
        if (!historyFile.exists()) {
            return classFiles;
        }
        File[] dirFiles = historyFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                if (pathname.isDirectory() && pathname.getName().equals(targetClass)) {
                    return true;
                }
                return false;
            }
        });

        for (File dirFile : dirFiles) {

            File[] cFiles = dirFile.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class") && !pathname.getName().contains("origin")) {
                        return true;
                    }
                    return false;
                }
            });
            classFiles.addAll(Arrays.asList(cFiles));
        }
        return classFiles;
    }
}
