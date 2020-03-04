package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(", Codewars.encode("Prespecialized"));
        assertEquals("))))())))", Codewars.encode("   ()(   "));
    }
}
