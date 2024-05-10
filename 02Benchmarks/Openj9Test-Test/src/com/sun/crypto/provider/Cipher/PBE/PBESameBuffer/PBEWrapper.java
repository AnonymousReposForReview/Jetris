package com.sun.crypto.provider.Cipher.PBE.PBESameBuffer;
/**
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates. All rights reserved.
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

import java.io.PrintStream;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 * PBEWrapper is the abstract class for all concrete PBE Cipher wrappers. A
 * PBEWrapper object encapsulates the information and behavior needed to test if
 * the multiple-part encryption/decryption is performing by expected way on the
 * same byte buffer.
 *
 * @author Alexandr Fomin
 * @author rhalade
 */
public abstract class PBEWrapper {

    protected final static int ITERATION_COUNT = 1000;

    protected final SecretKey key;
    protected final Cipher ci;
    protected final String algo;
    protected final PrintStream out;

    public PBEWrapper(String pAlgo, SecretKey pKey, Cipher pCi,
            PrintStream pOut ){
        this.algo = pAlgo;
        this.key = pKey;
        this.ci = pCi;
        this.out = pOut;
    }

    /**
     * Abstract method need to be implemented in the subclasses.
     *
     * @param edMode Cipher mode - encrypt/decrypt
     * @param inputText byte buffer to process
     * @param offset offset in byte the inputText
     * @param len length of byte to process in inputText
     * @return true if cipher operation is successful, false otherwise
     */
    public abstract boolean execute(int edMode, byte[] inputText, int offset,
            int len);

    /**
     * An utility method to prepare "salt" for following Secret Key generation.
     *
     * @param numberOfBytes number of bytes in salt
     * @return randomly generated byte array
     */
    protected static byte[] generateSalt(int numberOfBytes) {
        byte[] salt = new byte[numberOfBytes];
        new Random().nextBytes(salt);
        return salt;
    }

    /**
     * An utility method to check if two byte arrays are equal
     *
     * @param b1 first byte array
     * @param off1 offset to compare from in b1
     * @param b2 second byte array
     * @param off2 offset to compare from in b2
     * @param len length to compare
     * @return true of arrays are equal, false otherwise
     */
    protected boolean equalsBlock(byte[] b1, int off1,
            byte[] b2, int off2, int len) {
        for (int i = off1, j = off2, k = 0; k < len; i++, j++, k++) {
            if (b1[i] != b2[j]) {
                return false;
            }
        }
        return true;
    }
}
