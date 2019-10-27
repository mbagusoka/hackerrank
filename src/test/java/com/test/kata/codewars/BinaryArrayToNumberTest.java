package com.test.kata.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryArrayToNumberTest {

    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, Kata.convertBinaryArrayToInt(Arrays.asList(0,0,0,1)));
        assertEquals(15, Kata.convertBinaryArrayToInt(Arrays.asList(1,1,1,1)));
        assertEquals(6, Kata.convertBinaryArrayToInt(Arrays.asList(0,1,1,0)));
        assertEquals(9, Kata.convertBinaryArrayToInt(Arrays.asList(1,0,0,1)));
    }
}
