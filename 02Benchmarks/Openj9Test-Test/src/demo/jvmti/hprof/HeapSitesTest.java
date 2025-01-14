package demo.jvmti.hprof;
/**
 * Copyright (c) 2004, 2014, Oracle and/or its affiliates. All rights reserved.
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


/* @test
 * @bug 5012882 6299047
 * @summary Test jvmti hprof
 *
 * @compile -g:vars HelloWorld.java ../DemoRun.java
 * @build HeapSitesTest
 * @run main HeapSitesTest HelloWorld
 */

import demo.jvmti.DemoRun;

public class HeapSitesTest {

    public static void main(String args[]) throws Exception {
        DemoRun hprof;

        /* Run JVMTI hprof agent with heap=sites */
        hprof = new DemoRun("hprof", "heap=sites,file=heapsites.txt");
        hprof.runit(args[0]);

        /* Make sure patterns in output look ok */
        if (hprof.output_contains("ERROR")) {
            throw new RuntimeException("Test failed - ERROR seen in output");
        }

        /* Must be a pass. */
        System.out.println("Test passed - cleanly terminated");
    }
}
