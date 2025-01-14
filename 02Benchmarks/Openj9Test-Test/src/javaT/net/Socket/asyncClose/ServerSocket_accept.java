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
 * Tests that a thread blocked in ServerSocket.accept
 * throws a SocketException if the socket is asynchronously closed.
 */
import java.io.IOException;
import java.net.*;
import java.util.concurrent.CountDownLatch;

public class ServerSocket_accept extends AsyncCloseTest implements Runnable {
    private final ServerSocket ss;
    private final int timeout;
    private final CountDownLatch latch;

    public ServerSocket_accept() throws IOException {
       this(0);
    }

    public ServerSocket_accept(int timeout) throws IOException {
        this.timeout = timeout;
        latch = new CountDownLatch(1);
        ss = new ServerSocket(0);
    }

    public String description() {
        String s = "ServerSocket.accept()";
        if (timeout > 0) {
            s += " (with timeout)";
        }
        return s;
    }

    public void run() {
        try {
            latch.countDown();
            Socket s = ss.accept();
            failed("ServerSocket.accept() returned unexpectly!!");
        } catch (SocketException se) {
            closed();
        } catch (Exception e) {
            failed(e.getMessage());
        }
    }

    public AsyncCloseTest go(){
        try {
            Thread thr = new Thread(this);
            thr.start();
            latch.await();
            Thread.sleep(5000); //sleep, so ServerSocket.accept() can block
            ss.close();
            thr.join();

            if (isClosed()) {
                return passed();
            } else {
                return failed("ServerSocket.accept() wasn't preempted");
            }
        } catch (Exception x) {
            failed(x.getMessage());
            throw new RuntimeException(x);
        }
    }
}
