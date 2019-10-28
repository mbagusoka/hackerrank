package com.test.kata.codewars;

import junit.framework.TestCase;

public class PersistTest extends TestCase {

    public void testBasic() {
        assertEquals(3, Kata.persistence(39));
        assertEquals(0, Kata.persistence(4));
        assertEquals(2, Kata.persistence(25));
        assertEquals(4, Kata.persistence(999));
    }
}
