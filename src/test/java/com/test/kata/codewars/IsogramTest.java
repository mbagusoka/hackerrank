package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramTest {

    @Test
    public void fixedTests() {
        assertEquals(true, Codewars.isIsogram("Dermatoglyphics"));
        assertEquals(true, Codewars.isIsogram("isogram"));
        assertEquals(false, Codewars.isIsogram("moose"));
        assertEquals(false, Codewars.isIsogram("isIsogram"));
        assertEquals(false, Codewars.isIsogram("aba"));
        assertEquals(false, Codewars.isIsogram("moOse"));
        assertEquals(true, Codewars.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Codewars.isIsogram(""));
    }
}
