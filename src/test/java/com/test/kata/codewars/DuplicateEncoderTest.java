package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(", Kata.encode("Prespecialized"));
        assertEquals("))))())))", Kata.encode("   ()(   "));
    }
}
