package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import junit.framework.TestCase;

public class PersistTest extends TestCase {

    public void testBasic() {
        assertEquals(3, Codewars.persistence(39));
        assertEquals(0, Codewars.persistence(4));
        assertEquals(2, Codewars.persistence(25));
        assertEquals(4, Codewars.persistence(999));
    }
}
