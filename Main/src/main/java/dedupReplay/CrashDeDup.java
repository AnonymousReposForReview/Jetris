package dedupReplay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrashDeDup {

    public static HashMap<String, HashMap<String, ArrayList<CrashInfo>>> dedup(File directory) {

        HashMap<String, HashMap<String, ArrayList<CrashInfo>>> crashMap = new HashMap<>();
        //dedup hotspot
        ArrayList<CrashInfo> HCrashes = CrashDeDup.dedupHotSpotCrashLogs(directory);
        crashMap.put("Hotspot", dedupCrashInos(HCrashes));
        //dedup openj9
        ArrayList<CrashInfo> JCrashes = CrashDeDup.dedupOpenJ9CrashLogs(directory);
        crashMap.put("Openj9", dedupCrashInos(JCrashes));

        return crashMap;
    }

    public static HashMap<String, ArrayList<CrashInfo>> dedupCrashInos(ArrayList<CrashInfo> allCrashes) {

        HashMap<String, ArrayList<CrashInfo>> crashMap = new HashMap<>();
        for (CrashInfo eachCrash : allCrashes) {

            if (eachCrash.getCrashInfo().contains("Out of Memory Error")) {

                if (crashMap.keySet().contains("Out of Memory Error")) {
                    crashMap.get("Out of Memory Error").add(eachCrash);
                } else {
                    ArrayList<CrashInfo> tmp = new ArrayList<>();
                    tmp.add(eachCrash);
                    crashMap.put("Out of Memory Error", tmp);
                }
            } else {
                if (!eachCrash.getCrashInfo().equals("")) {
                    if (crashMap.keySet().contains(eachCrash.getCrashInfo())) {
                        crashMap.get(eachCrash.getCrashInfo()).add(eachCrash);
                    } else {
                        ArrayList<CrashInfo> tmp = new ArrayList<>();
                        tmp.add(eachCrash);
                        crashMap.put(eachCrash.getCrashInfo(), tmp);
                    }
                }
            }
        }
        return crashMap;
    }

    public static ArrayList<CrashInfo> dedupHotSpotCrashLogs(File directory) {

        String ErrorRegex = "Internal Error \\((.*?)\\)";
        String OOMRegex = "Out of Memory Error \\((.*?)\\)";
//        String FrameRegex = "^V\\s+\\[.+\\]\\s+.*$";
        Pattern ErrorPattern = Pattern.compile(ErrorRegex, Pattern.MULTILINE);
        Pattern OOMPattern = Pattern.compile(OOMRegex, Pattern.MULTILINE);
//        Pattern FramePattern = Pattern.compile(FrameRegex, Pattern.MULTILINE);

        ArrayList<CrashInfo> results = new ArrayList<>();
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".log"));

        for (File file : files) {
            String fileTxt = "";
            if (file.getName().startsWith(DeDupReplayConfig.hotspotCrashPrefix)) {
                StringBuilder stackBuilder = new StringBuilder();
                boolean stackFlag = false;

                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    int threshold = 3;
                    while ((line = reader.readLine()) != null) {
                        fileTxt = fileTxt + line + "\n";
                        if (stackFlag && threshold > 0) {
                            stackBuilder.append(line).append("\n");
                            threshold--;
                        }
                        if (line.startsWith("Native frames:")) {
                            stackFlag = true;
                        }
                        if (line.equals("")) {
                            stackFlag = false;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Matcher ematcher = ErrorPattern.matcher(fileTxt);
                Matcher omatcher = OOMPattern.matcher(fileTxt);
                HotspotCrashInfo hotspotCrashInfo = new HotspotCrashInfo(file.getAbsolutePath());
                if (ematcher.find()) {

                    StringBuilder errorLine = new StringBuilder();
                    ematcher.reset();
                    while (ematcher.find()) {
                        String match = ematcher.group();
                        errorLine.append(match).append("\n");
                    }
                    if (!errorLine.toString().equals("")) {
                        hotspotCrashInfo.setErrorMessage(errorLine.toString());
                    }

                }
                if (omatcher.find()) {

                    StringBuilder oomLine = new StringBuilder();
                    omatcher.reset();
                    while (omatcher.find()) {
                        String match = omatcher.group();
                        oomLine.append(match).append("\n");
                    }
                    if (!oomLine.toString().equals("")) {
                        hotspotCrashInfo.setErrorMessage(oomLine.toString());
                    }
                }
                hotspotCrashInfo.setStackFrames(stackBuilder.toString());
                String s = "";
                if (hotspotCrashInfo.getErrorMessage() != null) {
                    s = hotspotCrashInfo.getErrorMessage();
                } else if (hotspotCrashInfo.getStackFrames() != null) {
                    s = hotspotCrashInfo.getStackFrames();
                }
                results.add(new CrashInfo(hotspotCrashInfo.fileName, s));
            }
        }
        return results;
    }

    public static ArrayList<CrashInfo> dedupOpenJ9CrashLogs(File directory) {

        String assertionRegex = ".*ASSERTION FAILED.*";
        String VMFlagRegex = "^1XHFLAGS\\s+VM flags:\\d+"; // 正则表达式模式

        String OOMRegex = "Dump Event \"systhrow\" (00040000) Detail \"java/lang/OutOfMemoryError\" \"Java heap space\" received";
        String exceptModuleRegex = "1XHEXCPMODULE  Module: ";
        String currentThreadRegex = "1XMCURTHDINFO  Current thread";
        String nativeStackRegex = "3XMTHREADINFO3           Native callstack:";
        String stackFrameRegex = "4XENATIVESTACK";

        Pattern aseertionPattern = Pattern.compile(assertionRegex, Pattern.MULTILINE);
        Pattern flagPattern = Pattern.compile(VMFlagRegex, Pattern.MULTILINE);

        ArrayList<CrashInfo> results = new ArrayList<>();
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        for (File file : files) {
            StringBuilder fileTxt = new StringBuilder();
            if (file.getName().startsWith(DeDupReplayConfig.openj9CrashPrefix)) {
                J9CrashInfo j9CrashInfo = new J9CrashInfo(file.getAbsolutePath());
                boolean startCurrentThread = false;
                boolean startStack = false;
                StringBuilder nativeStackLines = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(exceptModuleRegex)) {
                            j9CrashInfo.setExceptModule(line);
                        }
                        if (line.contains(currentThreadRegex)) {
                            startCurrentThread = true;
                        }
                        if (line.contains(nativeStackRegex)) {
                            startStack = true;
                            continue;
                        }
                        if (startStack && startCurrentThread) {
                            if (line.startsWith(stackFrameRegex)) {
                                String formatedLine = line.replaceAll("0x\\w+", "").replaceFirst("4XENATIVESTACK\\s+", "").trim();
                                if (!formatedLine.equals("")) {
                                    nativeStackLines.append(formatedLine).append("\n");
                                }
                            } else {
                                startCurrentThread = false;
                                startStack = false;
                            }
                        }
                        fileTxt.append(line).append("\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!nativeStackLines.toString().equals("")) {
                    j9CrashInfo.setCurrentStackFrames(nativeStackLines.toString());
                }
                Matcher pmatcher = aseertionPattern.matcher(fileTxt.toString());
                Matcher fmatcher = flagPattern.matcher(fileTxt.toString());

                if (pmatcher.find()) {
                    StringBuilder assertInfo = new StringBuilder();
                    pmatcher.reset();
                    while (pmatcher.find()) {
                        String match = pmatcher.group();
                        match = match.substring(match.indexOf("** ASSERTION FAILED **"));
                        assertInfo.append(match).append("\n");
                    }
                    if (!assertInfo.toString().equals("")) {
                        j9CrashInfo.setAssertion(assertInfo.toString());
                    }
                }
                if (fmatcher.find()) {
                    StringBuilder flagLine = new StringBuilder();
                    fmatcher.reset();
                    while (fmatcher.find()) {
                        String match = fmatcher.group();
                        flagLine.append(match).append("\n");
                    }
                    if (!flagLine.toString().equals("")) {
                        j9CrashInfo.setVmFlag(flagLine.toString());
                    }
                }
                if (!fileTxt.toString().contains(OOMRegex)) {
                    StringBuilder sb = new StringBuilder();
                    if (j9CrashInfo.getAssertion() != null) {
                        sb.append(j9CrashInfo.getAssertion());
                    } else if (j9CrashInfo.getCurrentStackFrames() != null) {
                        sb.append(j9CrashInfo.getCurrentStackFrames());
                    } else if (j9CrashInfo.getVmFlag() != null) {
                        sb.append(j9CrashInfo.getVmFlag());
                    } else if (j9CrashInfo.getExceptModule() != null) {
                        sb.append(j9CrashInfo.getExceptModule()).append("\t");
                    }
                    results.add(new CrashInfo(file.getAbsolutePath(), sb.toString()));
                }
            }
        }
        return results;
    }

    public static class HotspotCrashInfo {
        private String errorMessage;
        private String stackFrames;
        private String fileName;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getStackFrames() {
            return stackFrames;
        }

        public void setStackFrames(String stackFrames) {
            this.stackFrames = stackFrames;
        }

        public HotspotCrashInfo(String fileName) {
            this.fileName = fileName;
        }

        public HotspotCrashInfo(String errorMessage, String stackFrames) {
            this.errorMessage = errorMessage;
            this.stackFrames = stackFrames;
        }
    }

    public static class J9CrashInfo {
        private String vmFlag;
        private String assertion;
        private String exceptModule;
        private String currentStackFrames;

        private String fileName;

        public String getVmFlag() {
            return vmFlag;
        }

        public void setVmFlag(String vmFlag) {
            this.vmFlag = vmFlag;
        }

        public String getAssertion() {
            return assertion;
        }

        public void setAssertion(String assertion) {
            this.assertion = assertion;
        }

        public String getExceptModule() {
            return exceptModule;
        }

        public void setExceptModule(String exceptModule) {
            this.exceptModule = exceptModule;
        }

        public String getCurrentStackFrames() {
            return currentStackFrames;
        }

        public void setCurrentStackFrames(String currentStackFrames) {
            this.currentStackFrames = currentStackFrames;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public J9CrashInfo(String fileName) {
            this.fileName = fileName;
        }

        public J9CrashInfo(String vmFlag, String assertion, String exceptModule, String currentStackFrames) {
            this.vmFlag = vmFlag;
            this.assertion = assertion;
            this.exceptModule = exceptModule;
            this.currentStackFrames = currentStackFrames;
        }
    }

    public static class CrashInfo {
        private String filePath;
        private String crashInfo;

        public CrashInfo(String filePath, String crashInfo) {
            this.filePath = filePath;
            this.crashInfo = crashInfo;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getCrashInfo() {
            return crashInfo;
        }

        public void setCrashInfo(String crashInfo) {
            this.crashInfo = crashInfo;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof CrashInfo) {
                return this.crashInfo.equals(((CrashInfo) obj).crashInfo);
            }
            return false;
        }

        @Override
        public String toString() {
            return filePath;
        }

        @Override
        public int hashCode() {
            return crashInfo.hashCode();
        }
    }
}
