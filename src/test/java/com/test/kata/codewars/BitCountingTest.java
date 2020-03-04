package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitCountingTest {

    @Test
    public void testGame() {
        assertEquals(5, Codewars.countBits(1234));
        assertEquals(1, Codewars.countBits(4));
        assertEquals(3, Codewars.countBits(7));
        assertEquals(2, Codewars.countBits(9));
        assertEquals(2, Codewars.countBits(10));
    }
}
