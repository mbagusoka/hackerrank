package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramTest {

    @Test
    public void fixedTests() {
        assertEquals(true, Kata.isIsogram("Dermatoglyphics"));
        assertEquals(true, Kata.isIsogram("isogram"));
        assertEquals(false, Kata.isIsogram("moose"));
        assertEquals(false, Kata.isIsogram("isIsogram"));
        assertEquals(false, Kata.isIsogram("aba"));
        assertEquals(false, Kata.isIsogram("moOse"));
        assertEquals(true, Kata.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Kata.isIsogram(""));
    }
}
