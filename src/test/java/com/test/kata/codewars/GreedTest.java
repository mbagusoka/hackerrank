package com.test.kata.codewars;

import junit.framework.TestCase;

public class GreedTest extends TestCase {

    public void testExample() {
        assertEquals(250, Kata.greedy(new int[]{5, 1, 3, 4, 1}));
        assertEquals(1100, Kata.greedy(new int[]{1 ,1 ,1 ,3 ,1}));
        assertEquals(450, Kata.greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
