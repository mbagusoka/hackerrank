package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MaxSequenceTest {

    @Test
    public void testEmptyArray() {
        assertEquals(0, Kata.sequence(new int[]{}));
    }

    @Test
    public void testAllNegative() {
        assertEquals(0, Kata.sequence(new int[]{-1, -2, -3, -4}));
    }

    @Test
    public void testExampleArray() {
        assertEquals(6, Kata.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
