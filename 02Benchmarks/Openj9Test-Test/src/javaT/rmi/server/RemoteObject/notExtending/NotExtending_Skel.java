package javaT.rmi.server.RemoteObject.notExtending;
/*
 * Copyright (c) 1998, Oracle and/or its affiliates. All rights reserved.
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

// Skeleton class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class NotExtending_Skel
    implements java.rmi.server.Skeleton
{
    private static java.rmi.server.Operation[] operations = {

    };

    private static final long interfaceHash = 3103311997983563335L;

    public java.rmi.server.Operation[] getOperations() {
        return operations;
    }

    public void dispatch(java.rmi.Remote obj, java.rmi.server.RemoteCall call, int opnum, long hash)
        throws java.lang.Exception
    {
        if (opnum < 0) {
            throw new java.rmi.UnmarshalException("invalid method hash");
        } else {
            if (hash != interfaceHash)
                throw new java.rmi.server.SkeletonMismatchException("interface hash mismatch");
        }

        NotExtending server = (NotExtending) obj;
        switch (opnum) {
        default:
            throw new java.rmi.UnmarshalException("invalid method number");
        }
    }
}
