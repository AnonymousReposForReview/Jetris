import config.ExecutionConfig;
import dedupReplay.CrashDeDup;
import dedupReplay.DeDupReplayConfig;
import dedupReplay.DiffLogDeDup;
import utils.Status;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DeDup {

    public static void main(String[] args) throws IOException {

        Status.argsParser(args);
        DeDupReplayConfig.projName = ExecutionConfig.TESTED_BENCHMARK;

        File result = new File(DeDupReplayConfig.resultPath);
        //01 dedup crash
        HashMap<String, HashMap<String, ArrayList<CrashDeDup.CrashInfo>>> crashMap = CrashDeDup.dedup(result);
        //02 dedup execption
        HashMap<String, ArrayList<DiffLogDeDup.DiffInfo>> diffMap = DiffLogDeDup.dedup(result);
        //03 print summary
        System.out.println(String.join("", Collections.nCopies(50,"=")) +
                " Summary Info " + String.join("", Collections.nCopies(50,"=")));

        System.out.println("Unique Crashes: " + crashMap.values().stream().mapToInt(HashMap::size).sum());
        System.out.println("\t\t Hotspot Crashes: " + crashMap.get("Hotspot").size());
        System.out.println("\t\t  OpenJ9 Crashes: " + crashMap.get("Openj9").size());

        if (diffMap.keySet().contains("ValueInconsistent")) {
            System.out.println("Unique Exception Diffs: " + (diffMap.keySet().size() - 1));
            System.out.println("Unique Value Diffs: " + diffMap.get("ValueInconsistent").size());
        } else {
            System.out.println("Unique Exception Diffs: " + diffMap.keySet().size());
            System.out.println("Unique Value Diffs: " + 0);
        }
        //04 dump to log
        printStatics(result, crashMap, diffMap);

    }

    public static void printStatics(File directory, HashMap<String, HashMap<String, ArrayList<CrashDeDup.CrashInfo>>> crashMap, HashMap<String, ArrayList<DiffLogDeDup.DiffInfo>> diffMap) {

        File summary = new File(directory, directory.getName() + "_summary.log");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(summary))) {

            //summary info
            bufferedWriter.write(String.join("", Collections.nCopies(50,"=")) +
                    " Summary Info " + String.join("", Collections.nCopies(50,"=")) + "\n");

            bufferedWriter.write("Unique Crashes: " + crashMap.values().stream().mapToInt(HashMap::size).sum() + "\n");
            bufferedWriter.write("\t\t Hotspot Crashes: " + crashMap.get("Hotspot").size() + "\n");
            bufferedWriter.write("\t\t  OpenJ9 Crashes: " + crashMap.get("Openj9").size() + "\n");

            if (diffMap.keySet().contains("ValueInconsistent")) {
                bufferedWriter.write("Unique Exception Diffs: " + (diffMap.keySet().size() - 1) + "\n");
                bufferedWriter.write("Unique Value Diffs: " + diffMap.get("ValueInconsistent").size() + "\n\n");
            } else {
                bufferedWriter.write("Unique Exception Diffs: " + diffMap.keySet().size() + "\n");
                bufferedWriter.write("Unique Value Diffs: " + 0 + "\n\n");
            }

            //detailed info
            bufferedWriter.write(String.join("", Collections.nCopies(50,"=")) +
                    " Detail Info " + String.join("", Collections.nCopies(50,"=")) + "\n");
            //Crash
            bufferedWriter.write("Unique Crashes: " + crashMap.values().stream().mapToInt(HashMap::size).sum() + "\n");
            bufferedWriter.write("Hotspot Crashes: \n");
            for (String errMessage : crashMap.get("Hotspot").keySet()) {

                ArrayList<CrashDeDup.CrashInfo> crashesInfo = crashMap.get("Hotspot").get(errMessage);
                String text = "";
                for (CrashDeDup.CrashInfo crashInfo : crashesInfo) {
                    text = text + " " + (new File(crashInfo.getFilePath())).getName();
                }
                bufferedWriter.write("[" + text +  "]" + "\n");

                bufferedWriter.write("Dedup Size: " + crashesInfo.size() + "\n" );
                bufferedWriter.write("Crash Info: \n" );

                bufferedWriter.write("\t\t" + errMessage.replace("\n", "\n\t\t") + "\n");
                if (errMessage.contains("Out of Memory Error")) {
                    bufferedWriter.write("\n");
                }
            }
            bufferedWriter.write("OpenJ9 Crashes: \n");
            for (String errMessage : crashMap.get("Openj9").keySet()) {

                ArrayList<CrashDeDup.CrashInfo> crashesInfo = crashMap.get("Openj9").get(errMessage);
                String text = "";
                for (CrashDeDup.CrashInfo crashInfo : crashesInfo) {
                    text += (new File(crashInfo.getFilePath())).getName();
                }
                bufferedWriter.write("[" + text +  "]" + "\n");

                bufferedWriter.write("Dedup Size: " + crashesInfo.size() + "\n" );
                bufferedWriter.write("Crash Info: \n" );

                bufferedWriter.write("\t\t" + errMessage.replace("\n", "\n\t\t") + "\n");
            }
            bufferedWriter.write("\n");

            //Failures
            bufferedWriter.write("Unique Exception Diffs: "
                    + (diffMap.keySet().contains("ValueInconsistent") ? (diffMap.keySet().size() - 1) : diffMap.keySet().size()) + "\n");
            for (String s : diffMap.keySet()) {
                if (!s.equals("ValueInconsistent")) {
                    bufferedWriter.write(s + ":\n");
                    for (DiffLogDeDup.DiffInfo diffInfo : diffMap.get(s)) {
                        bufferedWriter.write("\t\t" + diffInfo + "\n");
                    }
                }
            }
            bufferedWriter.write("\n");
            //Values
            if (diffMap.keySet().contains("ValueInconsistent")) {
                bufferedWriter.write("Unique Value Diffs: " + diffMap.get("ValueInconsistent").size() + "\n");
                for (DiffLogDeDup.DiffInfo valueInconsistent : diffMap.get("ValueInconsistent")) {
                    bufferedWriter.write("\t\t" + valueInconsistent + "\n");
                }
            } else {
                bufferedWriter.write("Unique Value Diffs: " + 0 + "\n\n");
            }

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
