package javaT.nio.Buffer;
/*
 * Copyright (c) 2001, Oracle and/or its affiliates. All rights reserved.
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
 * @summary Unit test for X-Buffer.order methods
 */

import java.io.*;
import java.nio.*;


public class Order {

    static final ByteOrder be = ByteOrder.BIG_ENDIAN;
    static final ByteOrder le = ByteOrder.LITTLE_ENDIAN;
    static final ByteOrder nord = ByteOrder.nativeOrder();

    static void ck(ByteOrder ord, ByteOrder expected) {
        if (ord != expected)
            throw new RuntimeException("Got " + ord
                                       + ", expected " + expected);
    }

    static void ckViews(ByteBuffer bb, ByteOrder ord) {
        ck(bb.asCharBuffer().order(), bb.order());
        ck(bb.asIntBuffer().order(), bb.order());
        ck(bb.asLongBuffer().order(), bb.order());
        ck(bb.asFloatBuffer().order(), bb.order());
        ck(bb.asDoubleBuffer().order(), bb.order());
    }

    static void ckByteBuffer(ByteBuffer bb) {
        ckViews(bb, bb.order());
        bb.order(be);
        ckViews(bb, be);
        bb.order(le);
        ckViews(bb, le);
    }

    public static void main(String args[]) throws Exception {

        ck(ByteBuffer.allocate(10).order(), be);
        ck(ByteBuffer.allocateDirect(10).order(), be);
        ck(ByteBuffer.allocate(10).order(be).order(), be);
        ck(ByteBuffer.allocate(10).order(le).order(), le);

        ckByteBuffer(ByteBuffer.allocate(10));
        ckByteBuffer(ByteBuffer.allocateDirect(10));

    }

}
