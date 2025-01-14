package com.sun.nio.sctp.SctpMultiChannelT;
/**
 * Copyright (c) 2009, 2010, Oracle and/or its affiliates. All rights reserved.
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
 * @bug 4927640
 * @summary Tests the SCTP protocol implementation
 * @author chegar
 */

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.nio.ByteBuffer;
import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.InvalidStreamException;
import com.sun.nio.sctp.MessageInfo;
import com.sun.nio.sctp.SctpMultiChannel;
import static java.lang.System.out;
import static java.lang.System.err;

public class Send {
    /* Latches used to synchronize between the client and server so that
     * connections without any IO may not be closed without being accepted */
    final CountDownLatch clientFinishedLatch = new CountDownLatch(1);
    final CountDownLatch serverFinishedLatch = new CountDownLatch(1);

    void test(String[] args) {
        SocketAddress address = null;
        Server server = null;

        if (!Util.isSCTPSupported()) {
            out.println("SCTP protocol is not supported");
            out.println("Test cannot be run");
            return;
        }

        if (args.length == 2) {
            /* requested to connecct to a specific address */
            try {
                int port = Integer.valueOf(args[1]);
                address = new InetSocketAddress(args[0], port);
            } catch (NumberFormatException nfe) {
                err.println(nfe);
            }
        } else {
            /* start server on local machine, default */
            try {
                server = new Server();
                server.start();
                address = server.address();
                debug("Server started and listening on " + address);
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return;
            }
        }

        doTest(address);
    }

    void doTest(SocketAddress peerAddress) {
        SctpMultiChannel channel = null;
        ByteBuffer buffer = ByteBuffer.allocate(Util.LARGE_BUFFER);
        MessageInfo info = MessageInfo.createOutgoing(null, 0);

        try {
            channel = SctpMultiChannel.open();

            /* TEST 1: send small message */
            int streamNumber = 0;
            debug("sending to " + peerAddress + " on stream number: " + streamNumber);
            info = MessageInfo.createOutgoing(peerAddress, streamNumber);
            buffer.put(Util.SMALL_MESSAGE.getBytes("ISO-8859-1"));
            buffer.flip();
            int position = buffer.position();
            int remaining = buffer.remaining();

            debug("sending small message: " + buffer);
            int sent = channel.send(buffer, info);

            check(sent == remaining, "sent should be equal to remaining");
            check(buffer.position() == (position + sent),
                    "buffers position should have been incremented by sent");

            /* TEST 2: receive the echoed message */
            buffer.clear();
            info = channel.receive(buffer, null, null);
            buffer.flip();
            check(info != null, "info is null");
            check(info.streamNumber() == streamNumber,
                    "message not sent on the correct stream");
            check(info.bytes() == Util.SMALL_MESSAGE.getBytes("ISO-8859-1").
                  length, "bytes received not equal to message length");
            check(info.bytes() == buffer.remaining(), "bytes != remaining");
            check(Util.compare(buffer, Util.SMALL_MESSAGE),
              "received message not the same as sent message");


            /* TEST 3: send large message */
            Set<Association> assocs = channel.associations();
            check(assocs.size() == 1, "there should be only one association");
            Iterator<Association> it = assocs.iterator();
            check(it.hasNext());
            Association assoc = it.next();
            streamNumber = assoc.maxOutboundStreams() - 1;

            debug("sending on stream number: " + streamNumber);
            info = MessageInfo.createOutgoing(assoc, null, streamNumber);
            buffer.clear();
            buffer.put(Util.LARGE_MESSAGE.getBytes("ISO-8859-1"));
            buffer.flip();
            position = buffer.position();
            remaining = buffer.remaining();

            debug("sending large message: " + buffer);
            sent = channel.send(buffer, info);

            check(sent == remaining, "sent should be equal to remaining");
            check(buffer.position() == (position + sent),
                    "buffers position should have been incremented by sent");

            /* TEST 4: receive the echoed message */
            buffer.clear();
            info = channel.receive(buffer, null, null);
            buffer.flip();
            check(info != null, "info is null");
            check(info.streamNumber() == streamNumber,
                    "message not sent on the correct stream");
            check(info.bytes() == Util.LARGE_MESSAGE.getBytes("ISO-8859-1").
                  length, "bytes received not equal to message length");
            check(info.bytes() == buffer.remaining(), "bytes != remaining");
            check(Util.compare(buffer, Util.LARGE_MESSAGE),
              "received message not the same as sent message");


            /* TEST 5: InvalidStreamExcepton */
            streamNumber = assoc.maxOutboundStreams() + 1;
            info = MessageInfo.createOutgoing(assoc, null, streamNumber);
            buffer.clear();
            buffer.put(Util.SMALL_MESSAGE.getBytes("ISO-8859-1"));
            buffer.flip();
            position = buffer.position();
            remaining = buffer.remaining();

            debug("sending on stream number: " + streamNumber);
            debug("sending small message: " + buffer);
            try {
                sent = channel.send(buffer, info);
                fail("should have thrown InvalidStreamExcepton");
            } catch (InvalidStreamException ise){
                pass();
            } catch (IOException ioe) {
                unexpected(ioe);
            }
            check(buffer.remaining() == remaining,
                    "remaining should not be changed");
            check(buffer.position() == position,
                    "buffers position should not be changed");


            /* TEST 5: getRemoteAddresses(Association) */
            channel.getRemoteAddresses(assoc);

            /* TEST 6: Send from heap buffer to force implementation to
             * substitute with a native buffer, then check that its position
             * is updated correctly */
            info = MessageInfo.createOutgoing(assoc, null, 0);
            buffer.clear();
            buffer.put(Util.SMALL_MESSAGE.getBytes("ISO-8859-1"));
            buffer.flip();
            final int offset = 1;
            buffer.position(offset);
            remaining = buffer.remaining();

            try {
                sent = channel.send(buffer, info);

                check(sent == remaining, "sent should be equal to remaining");
                check(buffer.position() == (offset + sent),
                        "buffers position should have been incremented by sent");
            } catch (IllegalArgumentException iae) {
                fail(iae + ", Error updating buffers position");
            }

        } catch (IOException ioe) {
            unexpected(ioe);
        } finally {
            clientFinishedLatch.countDown();
            try { serverFinishedLatch.await(10L, TimeUnit.SECONDS); }
            catch (InterruptedException ie) { unexpected(ie); }
            if (channel != null) {
                try { channel.close(); }
                catch (IOException e) { unexpected (e);}
            }
        }
    }

    class Server implements Runnable
    {
        final InetSocketAddress serverAddr;
        private SctpMultiChannel serverChannel;

        public Server() throws IOException {
            serverChannel = SctpMultiChannel.open().bind(null);
            java.util.Set<SocketAddress> addrs = serverChannel.getAllLocalAddresses();
            if (addrs.isEmpty())
                debug("addrs should not be empty");

            serverAddr = (InetSocketAddress) addrs.iterator().next();
        }

        public void start() {
            (new Thread(this, "Server-"  + serverAddr.getPort())).start();
        }

        public InetSocketAddress address() {
            return serverAddr;
        }

        @Override
        public void run() {
            ByteBuffer buffer = ByteBuffer.allocateDirect(Util.LARGE_BUFFER);
            try {
                MessageInfo info;

                /* receive a small message */
                do {
                    info = serverChannel.receive(buffer, null, null);
                    if (info == null) {
                        fail("Server: unexpected null from receive");
                            return;
                    }
                } while (!info.isComplete());

                buffer.flip();
                check(info != null, "info is null");
                check(info.streamNumber() == 0,
                        "message not sent on the correct stream");
                check(info.bytes() == Util.SMALL_MESSAGE.getBytes("ISO-8859-1").
                      length, "bytes received not equal to message length");
                check(info.bytes() == buffer.remaining(), "bytes != remaining");
                check(Util.compare(buffer, Util.SMALL_MESSAGE),
                  "received message not the same as sent message");

                check(info != null, "info is null");
                Set<Association> assocs = serverChannel.associations();
                check(assocs.size() == 1, "there should be only one association");
                Iterator<Association> it = assocs.iterator();
                check(it.hasNext());
                Association assoc = it.next();

                /* echo the message */
                debug("Server: echoing first message");
                buffer.flip();
                int bytes = serverChannel.send(buffer, info);
                debug("Server: sent " + bytes + "bytes");

                /* receive a large message */
                buffer.clear();
                do {
                    info = serverChannel.receive(buffer, null, null);
                    if (info == null) {
                        fail("Server: unexpected null from receive");
                            return;
                    }
                } while (!info.isComplete());

                buffer.flip();

                check(info.streamNumber() == assoc.maxInboundStreams() - 1,
                        "message not sent on the correct stream");
                check(info.bytes() == Util.LARGE_MESSAGE.getBytes("ISO-8859-1").
                      length, "bytes received not equal to message length");
                check(info.bytes() == buffer.remaining(), "bytes != remaining");
                check(Util.compare(buffer, Util.LARGE_MESSAGE),
                  "received message not the same as sent message");

                /* echo the message */
                debug("Server: echoing second message");
                buffer.flip();
                bytes = serverChannel.send(buffer, info);
                debug("Server: sent " + bytes + "bytes");

                /* TEST 6 */
                ByteBuffer expected = ByteBuffer.allocate(Util.SMALL_BUFFER);
                expected.put(Util.SMALL_MESSAGE.getBytes("ISO-8859-1"));
                expected.flip();
                final int offset = 1;
                expected.position(offset);
                buffer.clear();
                do {
                    info = serverChannel.receive(buffer, null, null);
                    if (info == null) {
                        fail("Server: unexpected null from receive");
                        return;
                    }
                } while (!info.isComplete());

                buffer.flip();
                check(info != null, "info is null");
                check(info.streamNumber() == 0, "message not sent on the correct stream");
                check(info.bytes() == expected.remaining(),
                    "bytes received not equal to message length");
                check(info.bytes() == buffer.remaining(), "bytes != remaining");
                check(expected.equals(buffer),
                    "received message not the same as sent message");

                clientFinishedLatch.await(10L, TimeUnit.SECONDS);
                serverFinishedLatch.countDown();
            } catch (IOException ioe) {
                unexpected(ioe);
            } catch (InterruptedException ie) {
                unexpected(ie);
            } finally {
                try { if (serverChannel != null) serverChannel.close(); }
                catch (IOException  unused) {}
            }
        }
    }

        //--------------------- Infrastructure ---------------------------
    boolean debug = true;
    volatile int passed = 0, failed = 0;
    void pass() {passed++;}
    void fail() {failed++; Thread.dumpStack();}
    void fail(String msg) {System.err.println(msg); fail();}
    void unexpected(Throwable t) {failed++; t.printStackTrace();}
    void check(boolean cond) {if (cond) pass(); else fail();}
    void check(boolean cond, String failMessage) {if (cond) pass(); else fail(failMessage);}
    void debug(String message) {if(debug) { System.out.println(message); }  }
    public static void main(String[] args) throws Throwable {
        Class<?> k = new Object(){}.getClass().getEnclosingClass();
        try {k.getMethod("instanceMain",String[].class)
                .invoke( k.newInstance(), (Object) args);}
        catch (Throwable e) {throw e.getCause();}}
    public void instanceMain(String[] args) throws Throwable {
        try {test(args);} catch (Throwable t) {unexpected(t);}
        System.out.printf("%nPassed = %d, failed = %d%n%n", passed, failed);
        if (failed > 0) throw new AssertionError("Some tests failed");}

}
