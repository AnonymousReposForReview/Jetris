package javaT.net.Socket;
/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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

/**
 * @test
 * @bug 4957669 5017871
 * @summary REGRESSION:create a socket with a Japanese hostname throws IllegalArgumentExcept; REGRESSION: host can't contain special chars such as space
 */

import java.net.Socket;
import java.net.UnknownHostException;

// internalized domain name test
public class IDNTest {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("\u67f4\u7530\u82b3\u6a39", 8000);
        } catch (UnknownHostException e) {
            // Expected
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Socket s = new Socket("ho st", 8000);
        } catch (UnknownHostException e) {
            // Expected
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
