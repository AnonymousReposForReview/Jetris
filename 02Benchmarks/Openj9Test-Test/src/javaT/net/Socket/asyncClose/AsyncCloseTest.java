package javaT.net.Socket.asyncClose;
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

/*
 * Abstract class representing an asynchronous close test - subclasses
 * should override description() and go() methods.
 */
public abstract class AsyncCloseTest {

    public abstract String description();

    public abstract AsyncCloseTest go();

    public synchronized boolean hasPassed() {
        return passed;
    }

    protected synchronized AsyncCloseTest passed() {
        if (reason == null)
            passed = true;
        return this;
    }

    protected synchronized AsyncCloseTest failed(String r) {
        passed = false;
        reason = r;
        return this;
    }

    public synchronized String failureReason() {
        return reason;
    }

    protected synchronized void closed() {
        closed = true;
    }

    protected synchronized boolean isClosed() {
        return closed;
    }

    private boolean passed;
    private String reason;
    private boolean closed;
}
