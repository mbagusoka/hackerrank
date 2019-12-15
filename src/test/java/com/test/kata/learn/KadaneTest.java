package com.test.kata.learn;

import junit.framework.TestCase;

public class KadaneTest extends TestCase {

    public void testEmpty() {
        int[] arr = new int[0];
        assertEquals(-1, Learn.kadane(arr));
    }

    public void testOne() {
        int[] arr = new int[] {1, 2, -3, 4};
        assertEquals(4, Learn.kadane(arr));
    }

    public void testTwo() {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, Learn.kadane(arr));
    }

    public void testAllMinus() {
        int[] arr = new int[] {-3, -1, -2, -4};
        assertEquals(-1, Learn.kadane(arr));
    }
}
