package com.test.kata.test;

import junit.framework.TestCase;

public class CodilityTest extends TestCase {

    public void testBinaryGapOne() {
        assertEquals(5, Codility.binaryGap(1041));
    }

    public void testBinaryGapTwo() {
        assertEquals(0, Codility.binaryGap(15));
    }

    public void testBinaryGapThree() {
        assertEquals(0, Codility.binaryGap(32));
    }

    public void testOddOccurrencesInArraySingle() {
        int[] test = {9};
        assertEquals(9, Codility.oddOccurrencesInArray(test));
    }

    public void testOddOccurrencesInArrayOne() {
        int[] test = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, Codility.oddOccurrencesInArray(test));
    }

    public void testSmallestIntegerOne() {
        int[] arr = {1, 3, 6, 4, 1, 2};
        assertEquals(5, Codility.smallestInteger(arr));
    }

    public void testSmallestIntegerTwo() {
        int[] arr = {1, 2, 3};
        assertEquals(4, Codility.smallestInteger(arr));
    }

    public void testSmallestIntegerThree() {
        int[] arr = {-1, -3};
        assertEquals(1, Codility.smallestInteger(arr));
    }
}
