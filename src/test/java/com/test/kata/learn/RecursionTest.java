package com.test.kata.learn;

import junit.framework.TestCase;

public class RecursionTest extends TestCase {

    public void testPowerOne() {
        assertEquals(8L, Recursive.power(2, 3));
    }

    public void testPowerTwo() {
        assertEquals(25L, Recursive.power(5, 2));
    }

    public void testPowerThree() {
        assertEquals(2384185791015625L, Recursive.power(25, 11));
    }

    public void testPowerFour() {
        assertEquals(-25L, Recursive.power(-5, 2));
    }

    public void testPowerFive() {
        assertEquals(0, Recursive.power(0, 24));
    }
}
