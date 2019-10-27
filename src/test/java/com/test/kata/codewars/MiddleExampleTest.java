package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleExampleTest {

    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
        assertEquals("sh", Kata.getMiddle("assshole"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
        assertEquals("s", Kata.getMiddle("asd"));
    }
}
