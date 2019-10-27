package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitCountingTest {

    @Test
    public void testGame() {
        assertEquals(5, Kata.countBits(1234));
        assertEquals(1, Kata.countBits(4));
        assertEquals(3, Kata.countBits(7));
        assertEquals(2, Kata.countBits(9));
        assertEquals(2, Kata.countBits(10));
    }
}
