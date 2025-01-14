package com.sun.java.swing.plaf.windows.WindowsRadioButtonUIT.T7089914;
/**
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyright (c) 2012 IBM Corporation
 */

/* @test
 * @bug 7089914
 * @summary Focus on image icons are not visible in javaws cache with high contrast mode
 * @author Sean Chou
 */

import javax.swing.*;
import java.lang.reflect.Field;

public class bug7089914 {

    public static void main(String[] args) throws Exception {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("Not WindowsLookAndFeel, test skipped");

            return;
        }

        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {

                JRadioButton rb = new JRadioButton();

                if (!"com.sun.java.swing.plaf.windows.WindowsRadioButtonUI".equals(rb.getUI().getClass().getName())) {
                    throw new RuntimeException("Unexpected UI class of JRadioButton");
                }

                try {
                    Field initializedField = rb.getUI().getClass().getDeclaredField("initialized");
                    initializedField.setAccessible(true);

                    if (!initializedField.getBoolean(rb.getUI())) {
                        throw new RuntimeException("initialized is false");
                    }

                    rb.getUI().uninstallUI(rb);

                    if (initializedField.getBoolean(rb.getUI())) {
                        throw new RuntimeException("initialized is true");
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
