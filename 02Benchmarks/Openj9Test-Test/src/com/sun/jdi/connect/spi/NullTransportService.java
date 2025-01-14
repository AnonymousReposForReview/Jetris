package com.sun.jdi.connect.spi;
/**
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

/*
 * A "test" TransportService used by regression/unit test :-
 * test/com/sun/jdi/connect/spi/GeneratedConnectors.java
 */
import com.sun.jdi.connect.spi.*;
import java.io.IOException;

public class NullTransportService extends TransportService {
    public String name() {
        return "Null";
    }

    public String description() {
        return "this is a test transport";
    }

    public Capabilities capabilities() {
        throw new RuntimeException("shouldn't get here");
    }

    public Connection attach(String address, long attachTimeout,
        long handshakeTimeout) throws IOException {
        throw new RuntimeException("shouldn't get here");
    }

    public ListenKey startListening(String address) throws IOException {
        throw new RuntimeException("shouldn't get here");
    }

    public String defaultAddress() {
        return "";
    }

    public ListenKey startListening() throws IOException {
        throw new RuntimeException("shouldn't get here");
    }

    public void stopListening(ListenKey key) throws IOException {
        throw new RuntimeException("shouldn't get here");
    }

    public Connection accept(ListenKey key, long acceptTimeout,
        long handshakeTimeout) throws IOException {
        throw new RuntimeException("shouldn't get here");
    }
}
