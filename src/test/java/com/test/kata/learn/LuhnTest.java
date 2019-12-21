package com.test.kata.learn;

import junit.framework.TestCase;

public class LuhnTest extends TestCase {

    public void testNull() {
        assertEquals("", Learn.luhn(null));
    }

    public void testEmptyString() {
        assertEquals("", Learn.luhn("  "));
    }

    public void testOddRequest() {
        assertEquals("1232", Learn.luhn("123"));
    }

    public void testEvenRequest() {
        assertEquals("12369", Learn.luhn("1236"));
    }
}
