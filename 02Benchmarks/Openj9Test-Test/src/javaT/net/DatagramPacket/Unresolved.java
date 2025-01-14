package javaT.net.DatagramPacket;
/*
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

/**
 * @test
 *
 * @bug 5021519
 *
 * @summary java.lang.NullPointerException: null buffer || null address
 */
import java.net.*;

public class Unresolved {
    public static void main(String[] args) throws Exception {
        InetSocketAddress remAddr =  InetSocketAddress.createUnresolved( "foo.bar", 161  );
        try {
            DatagramPacket packet1 = new DatagramPacket(  "Hellooo!".getBytes(), "Hellooo!".length(), remAddr  );
        } catch (IllegalArgumentException e) {
            // OK! We do expect that
            return;
        }
        throw new RuntimeException("Setting an unresolved address in a DatagramPacket shouldn't be allowed");
    }
}
