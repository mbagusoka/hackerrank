package com.test.kata.hackerrank;

import com.test.kata.online.Hackerrank;
import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotationTest extends TestCase {

    private int[] arr = new int[] {1, 2, 3, 4, 5};


    public void testEmptyArr() {
        int[] arr = new int[0];
        assertArrayEquals(new int[0], Hackerrank.rotLeft(arr, 1));
    }

    public void testZeroRotation() {
        int[] arr = new int[] {1, 2};
        assertArrayEquals(new int[] {1, 2}, Hackerrank.rotLeft(arr, 0));
    }

    public void testOneSizedArray() {
        int[] arr = new int[] {1};
        assertArrayEquals(new int[] {1}, Hackerrank.rotLeft(arr, 5));
    }

    public void testTwoRotation() {
        assertArrayEquals(new int[] {3, 4, 5, 1, 2}, Hackerrank.rotLeft(arr, 2));
    }

    public void testFourRotation() {
        assertArrayEquals(new int[] {5, 1, 2, 3, 4}, Hackerrank.rotLeft(arr, 4));
    }

    public void testFiveRotation() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Hackerrank.rotLeft(arr, 5));
    }

    public void testSixRotation() {
        assertArrayEquals(new int[] {2, 3, 4, 5, 1}, Hackerrank.rotLeft(arr, 6));
    }
}
