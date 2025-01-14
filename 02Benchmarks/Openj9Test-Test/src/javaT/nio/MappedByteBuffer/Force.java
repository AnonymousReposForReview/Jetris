package javaT.nio.MappedByteBuffer;
/*
 * Copyright (c) 2002, 2011, Oracle and/or its affiliates. All rights reserved.
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
 * @bug 4625907
 * @summary Testing force()
 * @run main/othervm Force
 * @key randomness
 */

import java.io.*;
import java.nio.*;
import java.util.*;
import java.nio.channels.*;

public class Force {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        long filesize = random.nextInt(3*1024*1024);
        int cut = random.nextInt((int)filesize);
        File file = File.createTempFile("Blah", null);
        file.deleteOnExit();
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.setLength(filesize);
            FileChannel fc = raf.getChannel();
            MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, cut, filesize-cut);
            mbb.force();
        }

        // improve chance that mapped buffer will be unmapped
        System.gc();
        Thread.sleep(500);
    }
}
