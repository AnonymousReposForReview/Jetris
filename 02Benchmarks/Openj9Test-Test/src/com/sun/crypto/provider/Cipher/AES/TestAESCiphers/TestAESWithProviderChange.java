package com.sun.crypto.provider.Cipher.AES.TestAESCiphers;
/*
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

import java.security.Security;

/*
 * @test
 * @bug 8044193
 * @summary Test AES ciphers with different modes and padding schemes after
 *  remove then add provider.
 * @run main/othervm/policy=testAES.policy TestAESWithProviderChange
 */

public class TestAESWithProviderChange extends Dynamic {
    public static void main(String argv[]) throws Exception {
        Security.removeProvider(SUNJCE);
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        new TestAESWithProviderChange().run(argv);
    }
}
