package com.test.kata.learn;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

    public void testFibonacciZero() {
        assertEquals(0, Recursive.fibonacci(0));
    }

    public void testFibonacciOne() {
        assertEquals(1, Recursive.fibonacci(1));
    }

    public void testFibonacciTwo() {
        assertEquals(2, Recursive.fibonacci(3));
    }

    public void testFibonacciThree() {
        assertEquals(3, Recursive.fibonacci(4));
    }
}
