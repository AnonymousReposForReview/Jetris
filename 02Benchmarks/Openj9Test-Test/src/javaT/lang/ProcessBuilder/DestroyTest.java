package javaT.lang.ProcessBuilder;
/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 4244896
 * @summary Test for the various platform specific implementations of
 *          destroyForcibly.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

abstract class ProcessTest implements Runnable {
    ProcessBuilder bldr;
    Process p;

    public Process killProc(boolean force) throws Exception {
        if (force) {
            p.destroyForcibly();
        } else {
            p.destroy();
        }
        return p;
    }

    public boolean isAlive() {
        return p.isAlive();
    }

    public void run() {
        try {
            String line;
            BufferedReader is =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = is.readLine()) != null)
                System.err.println("ProcessTrap: " + line);
        } catch(IOException e) {
            if (!e.getMessage().matches("[Ss]tream [Cc]losed")) {
                throw new RuntimeException(e);
            }
        }
    }

    public abstract void runTest() throws Exception;
}

class UnixTest extends ProcessTest {
    public UnixTest(File script) throws IOException {
        script.deleteOnExit();
        createScript(script);
        bldr = new ProcessBuilder(script.getCanonicalPath());
        bldr.redirectErrorStream(true);
        bldr.directory(new File("."));
        p = bldr.start();
    }

    void createScript(File processTrapScript) throws IOException {
        processTrapScript.deleteOnExit();
        FileWriter fstream = new FileWriter(processTrapScript);
        try (BufferedWriter out = new BufferedWriter(fstream)) {
            out.write("#!/bin/bash\n" +
                "echo \\\"ProcessTrap.sh started: trapping SIGTERM/SIGINT\\\"\n" +
                "trap bashtrap SIGTERM SIGINT\n" +
                "bashtrap()\n" +
                "{\n" +
                "    echo \\\"SIGTERM/SIGINT detected!\\\"\n" +
                "}\n" +
                "\n" +
                "while :\n" +
                "do\n" +
                "    sleep 1;\n" +
                "done\n");
        }
        processTrapScript.setExecutable(true, true);
    }

    @Override
    public void runTest() throws Exception {
        killProc(false);
        Thread.sleep(1000);
        if (!p.isAlive())
            throw new RuntimeException("Process terminated prematurely.");
        killProc(true).waitFor();
        if (p.isAlive())
            throw new RuntimeException("Problem terminating the process.");
    }
}

class MacTest extends UnixTest {
    public MacTest(File script) throws IOException {
        super(script);
    }

    @Override
    public void runTest() throws Exception {
        // On Mac, it appears that when we close the processes streams
        // after a destroy() call, the process terminates with a
        // SIGPIPE even if it was trapping the SIGTERM, so as with
        // windows, we skip the trap test and go straight to destroyForcibly().
        killProc(true).waitFor();
        if (p.isAlive())
            throw new RuntimeException("Problem terminating the process.");
    }
}

class WindowsTest extends ProcessTest {
    public WindowsTest() throws IOException {
        bldr = new ProcessBuilder("ftp");
        bldr.redirectErrorStream(true);
        bldr.directory(new File("."));
        p = bldr.start();
    }

    @Override
    public void runTest() throws Exception {
        killProc(true).waitFor();
    }
}

public class DestroyTest {

    public static ProcessTest getTest() throws Exception {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Windows")) {
            return new WindowsTest();
        } else if (osName.startsWith("Linux") == true) {
            return new UnixTest(
                File.createTempFile("ProcessTrap-", ".sh",null));
        } else if (osName.startsWith("Mac OS")) {
            return new MacTest(
                File.createTempFile("ProcessTrap-", ".sh",null));
        } else if (osName.equals("SunOS")) {
            return new UnixTest(
                File.createTempFile("ProcessTrap-", ".sh",null));
        } else if (osName.equals("AIX")) {
            return new UnixTest(
                File.createTempFile("ProcessTrap-", ".sh",null));
        }
        return null;
    }

    public static void main(String args[]) throws Exception {
        ProcessTest test = getTest();
        if (test == null) {
            throw new RuntimeException("Unrecognised OS");
        } else {
            new Thread(test).start();
            Thread.sleep(1000);
            test.runTest();
        }
    }
}

