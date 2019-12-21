package com.test.kata.learn;

import junit.framework.TestCase;

public class LuhnValidationAlgorithmTest extends TestCase {

    public void testNull() {
        assertFalse(Learn.luhnValidation(null));
    }

    public void testEmpty() {
        assertFalse(Learn.luhnValidation(" "));
    }

    public void testValidLuhn() {
        assertTrue(Learn.luhnValidation("12369"));
    }

    public void testInvalidLuhn() {
        assertFalse(Learn.luhnValidation("12363"));
    }
}
