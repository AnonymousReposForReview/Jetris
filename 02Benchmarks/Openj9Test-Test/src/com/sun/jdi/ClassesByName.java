package com.sun.jdi;
/**
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
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
 *  @test
 *  @bug 4287992
 *  @author Robert Field
 *
 *  @run build JDIScaffold VMConnection
 *  @run compile -g HelloWorld.java
 *  @run build ClassesByName
 *
 *  @summary ClassesByName verifies that all the classes in the
 *  loaded class list can be found with classesByName..
 *
 *  @run main ClassesByName HelloWorld
 */
import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.*;

import java.util.List;
import java.util.Iterator;

public class ClassesByName extends JDIScaffold {
    final String[] args;

    public static void main(String args[]) throws Exception {
        new ClassesByName(args).startTests();
    }

    ClassesByName(String args[]) throws Exception {
        super();
        this.args = args;
    }

    protected void runTests() throws Exception {
        connect(args);
        waitForVMStart();

        List all = vm().allClasses();
        for (Iterator it = all.iterator(); it.hasNext(); ) {
            ReferenceType cls = (ReferenceType)it.next();
            String name = cls.name();
            List found = vm().classesByName(name);
            if (found.contains(cls)) {
                System.out.println("Found class: " + name);
            } else {
                System.out.println("CLASS NOT FOUND: " + name);
                throw new Exception("CLASS NOT FOUND (by classesByName): " + name);
            }
        }

        // Allow application to complete
        resumeToVMDeath();
    }
}
