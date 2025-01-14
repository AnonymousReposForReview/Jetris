package javaT.net.Inet6Address.serialize;
/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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
 * @bug 4921029
 * @bug 6656849
 * @summary  java.net.Inet6Address fails to be serialized with IPv6 support
 * @summary  NullPointerException thrown while de-serializing IPV6 Address.
 */

import java.net.*;
import java.io.*;
import java.util.*;

public class Serialize {

     public static void main(String[] args)
         throws Exception
     {
         Enumeration nifs = NetworkInterface.getNetworkInterfaces();
         while (nifs.hasMoreElements()) {
            NetworkInterface nif = (NetworkInterface)nifs.nextElement();
            Enumeration addrs = nif.getInetAddresses();
            while (addrs.hasMoreElements()) {
                Object o = addrs.nextElement();
                if (o instanceof Inet6Address) {
                    Inet6Address addr = (Inet6Address) o;
                    System.out.println ("serializing " + addr);
                    if (!test (addr)) {
                        throw new RuntimeException ("failed on " + addr.toString());
                    }

                    /* now reconstruct address with string name
                     * and test again
                     */
                    byte[] bytes = addr.getAddress();
                    Inet6Address addr1 = Inet6Address.getByAddress ("foo", bytes, nif);
                    System.out.println ("serializing " + addr1);
                    if (!test (addr1)) {
                        throw new RuntimeException ("failed on " + addr1.toString());
                    }
                }
            }
        }

        ObjectInputStream ois;
        Inet6Address nobj;

         // check ::1 object serialised with 1.4.2 is readable

         File file = new File (System.getProperty("test.src"), "serial1.4.2.ser");
         ois = new ObjectInputStream(new FileInputStream(file));
         nobj = (Inet6Address) ois.readObject();
         ois.close();
         if (!nobj.equals (InetAddress.getByName ("::1"))) {
            throw new RuntimeException ("old ::1 not deserialized right");
         }

         System.out.println(nobj);

         // create an address with an unlikely numeric scope_id
         if (!test ((Inet6Address)InetAddress.getByName ("fe80::1%99"))) {
             throw new RuntimeException ("test failed on fe80::1%99");
         }

         // Deserialize an Inet6 address with a named interface
         file = new File (System.getProperty("test.src"), "serial-bge0.ser");
         ois = new ObjectInputStream(new FileInputStream(file));
         try {
             nobj = (Inet6Address) ois.readObject();
         } catch (NullPointerException e) {
             throw new RuntimeException("6656849 Not fixed: NullPointer when deserializing");
         } finally {
             ois.close();
         }

         nobj = (Inet6Address)InetAddress.getByAddress("foo.com", new byte[] {
             (byte)0xfe,(byte)0x80,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,
             (byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)1
         });
         if (!test1(nobj, addr1)) {
             throw new RuntimeException("failed with " + nobj.toString());
         }
         nobj = (Inet6Address)InetAddress.getByAddress("x.bar.com", new byte[] {
             (byte)0xfe,(byte)0xC0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,
             (byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)1
         });
         if (!test1(nobj, addr2)) {
             throw new RuntimeException("failed with " + nobj.toString());
         }
         nobj = (Inet6Address)InetAddress.getByName("::1");
         if (!test1(nobj, addr3)) {
             throw new RuntimeException("failed with " + nobj.toString());
         }

         System.out.println("All tests passed");
     }

     static boolean test (Inet6Address obj) throws Exception {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("i6a1.ser"));
         oos.writeObject(obj);
         oos.close();

         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("i6a1.ser"));
         Inet6Address nobj = (Inet6Address) ois.readObject();
         ois.close();

         if (nobj.equals(obj)) {
             return true;
         } else {
             return false;
         }
     }

    static boolean test1 (Inet6Address obj, byte[] buf) throws Exception {
         ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
         Inet6Address nobj = (Inet6Address) ois.readObject();
         ois.close();

         if (nobj.equals(obj)) {
             return true;
         } else {
             return false;
         }
    }

    // Inet6Address instances serialized with JDK 6

    static byte[] addr1 = {
        (byte)0xac,(byte)0xed,(byte)0x00,(byte)0x05,(byte)0x73,(byte)0x72,
        (byte)0x00,(byte)0x15,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x2e,(byte)0x49,
        (byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x36,(byte)0x41,(byte)0x64,
        (byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,(byte)0x5f,
        (byte)0x7c,(byte)0x20,(byte)0x81,(byte)0x52,(byte)0x2c,(byte)0x80,
        (byte)0x21,(byte)0x03,(byte)0x00,(byte)0x05,(byte)0x49,(byte)0x00,
        (byte)0x08,(byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,
        (byte)0x5f,(byte)0x69,(byte)0x64,(byte)0x5a,(byte)0x00,(byte)0x0c,
        (byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,(byte)0x5f,
        (byte)0x69,(byte)0x64,(byte)0x5f,(byte)0x73,(byte)0x65,(byte)0x74,
        (byte)0x5a,(byte)0x00,(byte)0x10,(byte)0x73,(byte)0x63,(byte)0x6f,
        (byte)0x70,(byte)0x65,(byte)0x5f,(byte)0x69,(byte)0x66,(byte)0x6e,
        (byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x5f,(byte)0x73,(byte)0x65,
        (byte)0x74,(byte)0x4c,(byte)0x00,(byte)0x06,(byte)0x69,(byte)0x66,
        (byte)0x6e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x74,(byte)0x00,
        (byte)0x12,(byte)0x4c,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2f,(byte)0x6c,(byte)0x61,(byte)0x6e,(byte)0x67,(byte)0x2f,
        (byte)0x53,(byte)0x74,(byte)0x72,(byte)0x69,(byte)0x6e,(byte)0x67,
        (byte)0x3b,(byte)0x5b,(byte)0x00,(byte)0x09,(byte)0x69,(byte)0x70,
        (byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,
        (byte)0x73,(byte)0x74,(byte)0x00,(byte)0x02,(byte)0x5b,(byte)0x42,
        (byte)0x78,(byte)0x72,(byte)0x00,(byte)0x14,(byte)0x6a,(byte)0x61,
        (byte)0x76,(byte)0x61,(byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,
        (byte)0x2e,(byte)0x49,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x41,
        (byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,
        (byte)0x2d,(byte)0x9b,(byte)0x57,(byte)0xaf,(byte)0x9f,(byte)0xe3,
        (byte)0xeb,(byte)0xdb,(byte)0x02,(byte)0x00,(byte)0x03,(byte)0x49,
        (byte)0x00,(byte)0x07,(byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,
        (byte)0x65,(byte)0x73,(byte)0x73,(byte)0x49,(byte)0x00,(byte)0x06,
        (byte)0x66,(byte)0x61,(byte)0x6d,(byte)0x69,(byte)0x6c,(byte)0x79,
        (byte)0x4c,(byte)0x00,(byte)0x08,(byte)0x68,(byte)0x6f,(byte)0x73,
        (byte)0x74,(byte)0x4e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x71,
        (byte)0x00,(byte)0x7e,(byte)0x00,(byte)0x01,(byte)0x78,(byte)0x70,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x02,(byte)0x74,(byte)0x00,(byte)0x07,(byte)0x66,
        (byte)0x6f,(byte)0x6f,(byte)0x2e,(byte)0x63,(byte)0x6f,(byte)0x6d,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x70,(byte)0x75,(byte)0x72,(byte)0x00,(byte)0x02,(byte)0x5b,
        (byte)0x42,(byte)0xac,(byte)0xf3,(byte)0x17,(byte)0xf8,(byte)0x06,
        (byte)0x08,(byte)0x54,(byte)0xe0,(byte)0x02,(byte)0x00,(byte)0x00,
        (byte)0x78,(byte)0x70,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,
        (byte)0xfe,(byte)0x80,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x78
    };

    static byte[] addr2 = {
        (byte)0xac,(byte)0xed,(byte)0x00,(byte)0x05,(byte)0x73,(byte)0x72,
        (byte)0x00,(byte)0x15,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x2e,(byte)0x49,
        (byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x36,(byte)0x41,(byte)0x64,
        (byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,(byte)0x5f,
        (byte)0x7c,(byte)0x20,(byte)0x81,(byte)0x52,(byte)0x2c,(byte)0x80,
        (byte)0x21,(byte)0x03,(byte)0x00,(byte)0x05,(byte)0x49,(byte)0x00,
        (byte)0x08,(byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,
        (byte)0x5f,(byte)0x69,(byte)0x64,(byte)0x5a,(byte)0x00,(byte)0x0c,
        (byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,(byte)0x5f,
        (byte)0x69,(byte)0x64,(byte)0x5f,(byte)0x73,(byte)0x65,(byte)0x74,
        (byte)0x5a,(byte)0x00,(byte)0x10,(byte)0x73,(byte)0x63,(byte)0x6f,
        (byte)0x70,(byte)0x65,(byte)0x5f,(byte)0x69,(byte)0x66,(byte)0x6e,
        (byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x5f,(byte)0x73,(byte)0x65,
        (byte)0x74,(byte)0x4c,(byte)0x00,(byte)0x06,(byte)0x69,(byte)0x66,
        (byte)0x6e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x74,(byte)0x00,
        (byte)0x12,(byte)0x4c,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2f,(byte)0x6c,(byte)0x61,(byte)0x6e,(byte)0x67,(byte)0x2f,
        (byte)0x53,(byte)0x74,(byte)0x72,(byte)0x69,(byte)0x6e,(byte)0x67,
        (byte)0x3b,(byte)0x5b,(byte)0x00,(byte)0x09,(byte)0x69,(byte)0x70,
        (byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,
        (byte)0x73,(byte)0x74,(byte)0x00,(byte)0x02,(byte)0x5b,(byte)0x42,
        (byte)0x78,(byte)0x72,(byte)0x00,(byte)0x14,(byte)0x6a,(byte)0x61,
        (byte)0x76,(byte)0x61,(byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,
        (byte)0x2e,(byte)0x49,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x41,
        (byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,
        (byte)0x2d,(byte)0x9b,(byte)0x57,(byte)0xaf,(byte)0x9f,(byte)0xe3,
        (byte)0xeb,(byte)0xdb,(byte)0x02,(byte)0x00,(byte)0x03,(byte)0x49,
        (byte)0x00,(byte)0x07,(byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,
        (byte)0x65,(byte)0x73,(byte)0x73,(byte)0x49,(byte)0x00,(byte)0x06,
        (byte)0x66,(byte)0x61,(byte)0x6d,(byte)0x69,(byte)0x6c,(byte)0x79,
        (byte)0x4c,(byte)0x00,(byte)0x08,(byte)0x68,(byte)0x6f,(byte)0x73,
        (byte)0x74,(byte)0x4e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x71,
        (byte)0x00,(byte)0x7e,(byte)0x00,(byte)0x01,(byte)0x78,(byte)0x70,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x02,(byte)0x74,(byte)0x00,(byte)0x09,(byte)0x78,
        (byte)0x2e,(byte)0x62,(byte)0x61,(byte)0x72,(byte)0x2e,(byte)0x63,
        (byte)0x6f,(byte)0x6d,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x70,(byte)0x75,(byte)0x72,(byte)0x00,
        (byte)0x02,(byte)0x5b,(byte)0x42,(byte)0xac,(byte)0xf3,(byte)0x17,
        (byte)0xf8,(byte)0x06,(byte)0x08,(byte)0x54,(byte)0xe0,(byte)0x02,
        (byte)0x00,(byte)0x00,(byte)0x78,(byte)0x70,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x10,(byte)0xfe,(byte)0xc0,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,
        (byte)0x78
    };

    static byte[] addr3 = {
        (byte)0xac,(byte)0xed,(byte)0x00,(byte)0x05,(byte)0x73,(byte)0x72,
        (byte)0x00,(byte)0x15,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x2e,(byte)0x49,
        (byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x36,(byte)0x41,(byte)0x64,
        (byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,(byte)0x5f,
        (byte)0x7c,(byte)0x20,(byte)0x81,(byte)0x52,(byte)0x2c,(byte)0x80,
        (byte)0x21,(byte)0x03,(byte)0x00,(byte)0x05,(byte)0x49,(byte)0x00,
        (byte)0x08,(byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,
        (byte)0x5f,(byte)0x69,(byte)0x64,(byte)0x5a,(byte)0x00,(byte)0x0c,
        (byte)0x73,(byte)0x63,(byte)0x6f,(byte)0x70,(byte)0x65,(byte)0x5f,
        (byte)0x69,(byte)0x64,(byte)0x5f,(byte)0x73,(byte)0x65,(byte)0x74,
        (byte)0x5a,(byte)0x00,(byte)0x10,(byte)0x73,(byte)0x63,(byte)0x6f,
        (byte)0x70,(byte)0x65,(byte)0x5f,(byte)0x69,(byte)0x66,(byte)0x6e,
        (byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x5f,(byte)0x73,(byte)0x65,
        (byte)0x74,(byte)0x4c,(byte)0x00,(byte)0x06,(byte)0x69,(byte)0x66,
        (byte)0x6e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x74,(byte)0x00,
        (byte)0x12,(byte)0x4c,(byte)0x6a,(byte)0x61,(byte)0x76,(byte)0x61,
        (byte)0x2f,(byte)0x6c,(byte)0x61,(byte)0x6e,(byte)0x67,(byte)0x2f,
        (byte)0x53,(byte)0x74,(byte)0x72,(byte)0x69,(byte)0x6e,(byte)0x67,
        (byte)0x3b,(byte)0x5b,(byte)0x00,(byte)0x09,(byte)0x69,(byte)0x70,
        (byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,
        (byte)0x73,(byte)0x74,(byte)0x00,(byte)0x02,(byte)0x5b,(byte)0x42,
        (byte)0x78,(byte)0x72,(byte)0x00,(byte)0x14,(byte)0x6a,(byte)0x61,
        (byte)0x76,(byte)0x61,(byte)0x2e,(byte)0x6e,(byte)0x65,(byte)0x74,
        (byte)0x2e,(byte)0x49,(byte)0x6e,(byte)0x65,(byte)0x74,(byte)0x41,
        (byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,
        (byte)0x2d,(byte)0x9b,(byte)0x57,(byte)0xaf,(byte)0x9f,(byte)0xe3,
        (byte)0xeb,(byte)0xdb,(byte)0x02,(byte)0x00,(byte)0x03,(byte)0x49,
        (byte)0x00,(byte)0x07,(byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,
        (byte)0x65,(byte)0x73,(byte)0x73,(byte)0x49,(byte)0x00,(byte)0x06,
        (byte)0x66,(byte)0x61,(byte)0x6d,(byte)0x69,(byte)0x6c,(byte)0x79,
        (byte)0x4c,(byte)0x00,(byte)0x08,(byte)0x68,(byte)0x6f,(byte)0x73,
        (byte)0x74,(byte)0x4e,(byte)0x61,(byte)0x6d,(byte)0x65,(byte)0x71,
        (byte)0x00,(byte)0x7e,(byte)0x00,(byte)0x01,(byte)0x78,(byte)0x70,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x02,(byte)0x70,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x70,(byte)0x75,(byte)0x72,
        (byte)0x00,(byte)0x02,(byte)0x5b,(byte)0x42,(byte)0xac,(byte)0xf3,
        (byte)0x17,(byte)0xf8,(byte)0x06,(byte)0x08,(byte)0x54,(byte)0xe0,
        (byte)0x02,(byte)0x00,(byte)0x00,(byte)0x78,(byte)0x70,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x10,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,
        (byte)0x01,(byte)0x78
    };
}
