package demo.jvmti.gctest;
/**
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
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
 *
 *   Sample target application for gctest AT.demo
 *
 */

public class BigHello {
    private final static int NLOOPS = 20000;
    private static Object garbage[];
    public static void main(String args[]) {
        long count = 0;
        System.out.println("Big Hello start");
        for(int i=1; i<=NLOOPS; i++) {
            count += i;
            garbage = new Object[i];
            garbage[0] = new Object();
        }
        System.out.println("Allocated " + count +
                           " array elements, and " + NLOOPS +
                           " arrays and Objects.");
        System.out.println("Big Hello end");
    }
}
