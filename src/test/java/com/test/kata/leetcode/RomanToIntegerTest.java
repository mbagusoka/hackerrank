package com.test.kata.leetcode;

import com.test.kata.online.LeetCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testOne() {
        assertEquals(1, LeetCode.romanToInt("I"));
    }

    @Test
    public void testTwo() {
        assertEquals(4, LeetCode.romanToInt("IV"));
    }

    @Test
    public void testThree() {
        assertEquals(9, LeetCode.romanToInt("IX"));
    }

    @Test
    public void testFour() {
        assertEquals(58, LeetCode.romanToInt("LVIII"));
    }

    @Test
    public void testFive() {
        assertEquals(1994, LeetCode.romanToInt("MCMXCIV"));
    }
}
