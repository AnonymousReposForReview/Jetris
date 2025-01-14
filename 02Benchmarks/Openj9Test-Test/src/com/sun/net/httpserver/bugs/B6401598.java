package com.sun.net.httpserver.bugs;
/**
 * Copyright (c) 2006, 2010, Oracle and/or its affiliates. All rights reserved.
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
 * @bug 6401598
 * @summary  new HttpServer cannot serve binary stream data
 */

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.InetSocketAddress;
import java.util.concurrent.*;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class B6401598 {

        static class MyHandler implements HttpHandler {

                public MyHandler() {

                }

                public void handle(HttpExchange arg0) throws IOException {
                        try {
                                InputStream is = arg0.getRequestBody();
                                OutputStream os = arg0.getResponseBody();

                                DataInputStream dis = new DataInputStream(is);

                                short input = dis.readShort();
                                while (dis.read() != -1) ;
                                dis.close();

                                DataOutputStream dos = new DataOutputStream(os);

                                arg0.sendResponseHeaders(200, 0);

                                dos.writeShort(input);

                                dos.flush();
                                dos.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                                error = true;
                        }
                }

        }

        static int port;
        static boolean error = false;
        static ExecutorService exec;
        static HttpServer server;

        public static void main(String[] args) {
                try {
                        server = HttpServer.create(new InetSocketAddress(0), 400);
                        server.createContext("/server/", new MyHandler());
                        exec = Executors.newFixedThreadPool(3);
                        server.setExecutor(exec);
                        port = server.getAddress().getPort();
                        server.start();

                        short counter;

                        for (counter = 0; counter < 1000; counter++) {
                                HttpURLConnection connection = getHttpURLConnection(new URL("http://127.0.0.1:"+port+"/server/"), 10000);

                                OutputStream os = connection.getOutputStream();

                                DataOutputStream dos = new DataOutputStream(os);

                                dos.writeShort(counter);

                                dos.flush();
                                dos.close();

                                counter++;

                                InputStream is = connection.getInputStream();

                                DataInputStream dis = new DataInputStream(is);

                                short ret = dis.readShort();

                                dis.close();
                        }
                        System.out.println ("Stopping");
                        server.stop (1);
                        exec.shutdown();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        server.stop (1);
                        exec.shutdown();
                }
        }



        static HttpURLConnection getHttpURLConnection(URL url, int timeout) throws IOException {

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                httpURLConnection.setConnectTimeout(40000);
                httpURLConnection.setReadTimeout(timeout);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setRequestMethod("POST");

                // HttpURLConnection httpURLConnection = new MyHttpURLConnection(url);

                return httpURLConnection;
        }
}
