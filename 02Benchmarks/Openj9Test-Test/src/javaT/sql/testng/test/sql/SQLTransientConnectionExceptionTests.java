package javaT.sql.testng.test.sql;
/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
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

import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import javaT.sql.testng.util.BaseTest;

public class SQLTransientConnectionExceptionTests extends BaseTest {

    /**
     * Create SQLTransientConnectionException and setting all objects to null
     */
    @Test
    public void test() {
        SQLTransientConnectionException e =
                new SQLTransientConnectionException( null,
                null, errorCode, null);
        assertTrue(e.getMessage() == null && e.getSQLState() == null
                && e.getCause() == null && e.getErrorCode() == errorCode);
    }

    /**
     * Create SQLTransientConnectionException with no-arg constructor
     */
    @Test
    public void test1() {
        SQLTransientConnectionException ex = new SQLTransientConnectionException();
        assertTrue(ex.getMessage() == null
                && ex.getSQLState() == null
                && ex.getCause() == null
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with message
     */
    @Test
    public void test2() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState() == null
                && ex.getCause() == null
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with message, and SQLState
     */
    @Test
    public void test3() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason, state);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState().equals(state)
                && ex.getCause() == null
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with message, SQLState, and error code
     */
    @Test
    public void test4() {;
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason, state, errorCode);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState().equals(state)
                && ex.getCause() == null
                && ex.getErrorCode() == errorCode);
    }

    /**
     * Create SQLTransientConnectionException with message, SQLState, errorCode, and Throwable
     */
    @Test
    public void test5() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason, state, errorCode, t);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState().equals(state)
                && cause.equals(ex.getCause().toString())
                && ex.getErrorCode() == errorCode);
    }

    /**
     * Create SQLTransientConnectionException with message, SQLState, and Throwable
     */
    @Test
    public void test6() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason, state, t);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState().equals(state)
                && cause.equals(ex.getCause().toString())
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with message, and Throwable
     */
    @Test
    public void test7() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(reason, t);
        assertTrue(ex.getMessage().equals(reason)
                && ex.getSQLState() == null
                && cause.equals(ex.getCause().toString())
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with null Throwable
     */
    @Test
    public void test8() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException((Throwable)null);
        assertTrue(ex.getMessage() == null
                && ex.getSQLState() == null
                && ex.getCause() == null
                && ex.getErrorCode() == 0);
    }

    /**
     * Create SQLTransientConnectionException with Throwable
     */
    @Test
    public void test9() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException(t);
        assertTrue(ex.getMessage().equals(cause)
                && ex.getSQLState() == null
                && cause.equals(ex.getCause().toString())
                && ex.getErrorCode() == 0);
    }

    /**
     * Serialize a SQLTransientConnectionException and make sure you can read it back properly
     */
    @Test
    public void test10() throws Exception {
        SQLTransientConnectionException e =
                new SQLTransientConnectionException(reason, state, errorCode, t);
        SQLTransientConnectionException ex1 =
                createSerializedException(e);
        assertTrue(reason.equals(ex1.getMessage())
                && ex1.getSQLState().equals(state)
                && cause.equals(ex1.getCause().toString())
                && ex1.getErrorCode() == errorCode);
    }

    /**
     * Validate that the ordering of the returned Exceptions is correct
     * using for-each loop
     */
    @Test
    public void test11() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException("Exception 1", t1);
        SQLTransientConnectionException ex1 =
                new SQLTransientConnectionException("Exception 2");
        SQLTransientConnectionException ex2 =
                new SQLTransientConnectionException("Exception 3", t2);
        ex.setNextException(ex1);
        ex.setNextException(ex2);
        int num = 0;
        for (Throwable e : ex) {
            assertTrue(msgs[num++].equals(e.getMessage()));
        }
    }

    /**
     * Validate that the ordering of the returned Exceptions is correct
     * using traditional while loop
     */
    @Test
    public void test12() {
        SQLTransientConnectionException ex =
                new SQLTransientConnectionException("Exception 1", t1);
        SQLTransientConnectionException ex1 =
                new SQLTransientConnectionException("Exception 2");
        SQLTransientConnectionException ex2 =
                new SQLTransientConnectionException("Exception 3", t2);
        ex.setNextException(ex1);
        ex.setNextException(ex2);
        int num = 0;
        SQLException sqe = ex;
        while (sqe != null) {
            assertTrue(msgs[num++].equals(sqe.getMessage()));
            Throwable c = sqe.getCause();
            while (c != null) {
                assertTrue(msgs[num++].equals(c.getMessage()));
                c = c.getCause();
            }
            sqe = sqe.getNextException();
        }
    }

    /**
     * Create SQLTransientConnectionException and validate it is an instance of
     * SQLNonTransientException
     */
    @Test
    public void test13() {
        Exception ex = new SQLTransientConnectionException();
        assertTrue(ex instanceof SQLTransientException);
    }
}
