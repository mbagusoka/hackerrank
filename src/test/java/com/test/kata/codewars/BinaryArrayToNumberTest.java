package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryArrayToNumberTest {

    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, Codewars.convertBinaryArrayToInt(Arrays.asList(0,0,0,1)));
        assertEquals(15, Codewars.convertBinaryArrayToInt(Arrays.asList(1,1,1,1)));
        assertEquals(6, Codewars.convertBinaryArrayToInt(Arrays.asList(0,1,1,0)));
        assertEquals(9, Codewars.convertBinaryArrayToInt(Arrays.asList(1,0,0,1)));
    }
}
