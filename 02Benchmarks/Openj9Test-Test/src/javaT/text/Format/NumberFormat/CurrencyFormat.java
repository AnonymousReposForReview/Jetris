package javaT.text.Format.NumberFormat;
/*
 * Copyright (c) 2001, 2018, Oracle and/or its affiliates. All rights reserved.
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
 * @test
 * @bug 4290801 4942982 5102005 8008577 8021121 8210153
 * @summary Basic tests for currency formatting.
 * @run main/othervm -Djava.locale.providers=JRE,SPI CurrencyFormat
 */

import java.io.File;
import java.io.FileInputStream;
import java.util.Currency;
import java.util.Locale;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class CurrencyFormat {

    public static void main(String[] args) throws Exception {
        testFormatting();
        testSymbols();
    }

    static void testFormatting() {
        boolean failed = false;
        Locale[] locales = {
            Locale.US,
            Locale.JAPAN,
            Locale.GERMANY,
            Locale.ITALY,
            new Locale("it", "IT", "EURO") };
        Currency[] currencies = {
            null,
            Currency.getInstance("USD"),
            Currency.getInstance("JPY"),
            Currency.getInstance("DEM"),
            Currency.getInstance("EUR"),
        };
        String[][] expecteds = {
            {"$1,234.56", "$1,234.56", "JPY1,235", "DEM1,234.56", "EUR1,234.56"},
            {"\uFFE51,235", "USD1,234.56", "\uFFE51,235", "DEM1,234.56", "EUR1,234.56"},
            {"1.234,56 \u20AC", "1.234,56 USD", "1.235 JPY", "1.234,56 DM", "1.234,56 \u20AC"},
            {"\u20AC 1.234,56", "USD 1.234,56", "JPY 1.235", "DEM 1.234,56", "\u20AC 1.234,56"},
            {"\u20AC 1.234,56", "USD 1.234,56", "JPY 1.235", "DEM 1.234,56", "\u20AC 1.234,56"},
        };

        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            NumberFormat format = NumberFormat.getCurrencyInstance(locale);
            for (int j = 0; j < currencies.length; j++) {
                Currency currency = currencies[j];
                String expected = expecteds[i][j];
                if (currency != null) {
                    format.setCurrency(currency);
                    int digits = currency.getDefaultFractionDigits();
                    format.setMinimumFractionDigits(digits);
                    format.setMaximumFractionDigits(digits);
                }
                String result = format.format(1234.56);
                if (!result.equals(expected)) {
                    failed = true;
                    System.out.println("FAIL: Locale " + locale
                        + (currency == null ? ", default currency" : (", currency: " + currency))
                        + ", expected: " + expected
                        + ", actual: " + result);
                }
            }
        }

        if (failed) {
            throw new RuntimeException();
        }
    }

    static void testSymbols() throws Exception {
        FileInputStream stream = new FileInputStream(new File(System.getProperty("test.src", "."), "CurrencySymbols.properties"));
        Properties props = new Properties();
        props.load(stream);
        SimpleDateFormat format = null;

        Locale[] locales = NumberFormat.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);
            String result = symbols.getCurrencySymbol();
            String expected = (String) props.get(locale.toString());

            if (expected == null) {
                System.out.println("Warning: No expected currency symbol defined for locale " + locale);
            } else {
                    if (expected.contains(";")) {
                        StringTokenizer tokens = new StringTokenizer(expected, ";");
                        int tokensCount = tokens.countTokens();

                        if (tokensCount == 3) {
                            expected = tokens.nextToken();
                            if (format == null) {
                                format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
                                format.setTimeZone(TimeZone.getTimeZone("GMT"));
                                format.setLenient(false);
                            }

                            if (format.parse(tokens.nextToken()).getTime() < System.currentTimeMillis()) {
                                expected = tokens.nextToken();
                            }
                        }
                    }

                    if (!expected.equals(result)) {
                        throw new RuntimeException("Wrong currency symbol for locale " +
                            locale + ", expected: " + expected + ", got: " + result);
                    }
            }
        }
    }
}
