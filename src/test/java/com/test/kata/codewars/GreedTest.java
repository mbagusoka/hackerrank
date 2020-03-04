package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import junit.framework.TestCase;

public class GreedTest extends TestCase {

    public void testExample() {
        assertEquals(250, Codewars.greedy(new int[]{5, 1, 3, 4, 1}));
        assertEquals(1100, Codewars.greedy(new int[]{1 ,1 ,1 ,3 ,1}));
        assertEquals(450, Codewars.greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
