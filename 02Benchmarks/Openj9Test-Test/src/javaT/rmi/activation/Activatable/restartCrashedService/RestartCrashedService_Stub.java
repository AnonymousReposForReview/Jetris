package javaT.rmi.activation.Activatable.restartCrashedService;
/*
 * Copyright (c) 1998, 1999, Oracle and/or its affiliates. All rights reserved.
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

// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class RestartCrashedService_Stub
    extends java.rmi.server.RemoteStub
    implements ActivateMe
{
    private static final java.rmi.server.Operation[] operations = {
        new java.rmi.server.Operation("void crash()"),
        new java.rmi.server.Operation("ActivateMe getUnicastVersion()"),
        new java.rmi.server.Operation("void ping(java.lang.String)")
    };

    private static final long interfaceHash = -5511576339806675599L;

    private static final long serialVersionUID = 2;

    private static boolean useNewInvoke;
    private static java.lang.reflect.Method $method_crash_0;
    private static java.lang.reflect.Method $method_getUnicastVersion_1;
    private static java.lang.reflect.Method $method_ping_2;

    static {
        try {
            java.rmi.server.RemoteRef.class.getMethod("invoke",
                new java.lang.Class[] {
                    java.rmi.Remote.class,
                    java.lang.reflect.Method.class,
                    java.lang.Object[].class,
                    long.class
                });
            useNewInvoke = true;
            $method_crash_0 = ActivateMe.class.getMethod("crash", new java.lang.Class[] {});
            $method_getUnicastVersion_1 = ActivateMe.class.getMethod("getUnicastVersion", new java.lang.Class[] {});
            $method_ping_2 = ActivateMe.class.getMethod("ping", new java.lang.Class[] {java.lang.String.class});
        } catch (java.lang.NoSuchMethodException e) {
            useNewInvoke = false;
        }
    }

    // constructors
    public RestartCrashedService_Stub() {
        super();
    }
    public RestartCrashedService_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // methods from remote interfaces

    // implementation of crash()
    public void crash()
        throws java.lang.Exception
    {
        if (useNewInvoke) {
            ref.invoke(this, $method_crash_0, null, 8484760490859430950L);
        } else {
            java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 0, interfaceHash);
            ref.invoke(call);
            ref.done(call);
        }
    }

    // implementation of getUnicastVersion()
    public ActivateMe getUnicastVersion()
        throws java.rmi.RemoteException
    {
        try {
            if (useNewInvoke) {
                Object $result = ref.invoke(this, $method_getUnicastVersion_1, null, -4366214672304578894L);
                return ((ActivateMe) $result);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 1, interfaceHash);
                ref.invoke(call);
                ActivateMe $result;
                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $result = (ActivateMe) in.readObject();
                } catch (java.io.IOException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling return", e);
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling return", e);
                } finally {
                    ref.done(call);
                }
                return $result;
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("undeclared checked exception", e);
        }
    }

    // implementation of ping(String)
    public void ping(java.lang.String $param_String_1)
        throws java.rmi.RemoteException
    {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_ping_2, new java.lang.Object[] {$param_String_1}, 8618968970901024056L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 2, interfaceHash);
                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling arguments", e);
                }
                ref.invoke(call);
                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("undeclared checked exception", e);
        }
    }
}
