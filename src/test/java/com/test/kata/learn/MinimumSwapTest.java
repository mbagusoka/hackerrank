package com.test.kata.learn;

import com.test.kata.online.Hackerrank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSwapTest {

    @Test
    public void testOne() {
        int[] arr = new int[]{4, 3, 1, 2};
        assertEquals(3, Hackerrank.minimumSwaps(arr));
    }

    @Test
    public void testTwo() {
        int[] arr = new int[]{2, 3, 4, 1, 5};
        assertEquals(3, Hackerrank.minimumSwaps(arr));
    }

    @Test
    public void testThree() {
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};
        assertEquals(3, Hackerrank.minimumSwaps(arr));
    }
}
