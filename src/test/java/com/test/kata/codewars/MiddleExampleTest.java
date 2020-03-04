package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleExampleTest {

    @Test
    public void evenTests() {
        assertEquals("es", Codewars.getMiddle("test"));
        assertEquals("dd", Codewars.getMiddle("middle"));
        assertEquals("sh", Codewars.getMiddle("assshole"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Codewars.getMiddle("testing"));
        assertEquals("A", Codewars.getMiddle("A"));
        assertEquals("s", Codewars.getMiddle("asd"));
    }
}
