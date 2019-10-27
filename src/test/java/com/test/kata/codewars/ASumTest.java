package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ASumTest {

    @Test
    public void test1() {
        assertEquals(2022, Kata.findNb(4183059834009L));
    }

    @Test
    public void test2() {
        assertEquals(-1, Kata.findNb(24723578342962L));
    }

    @Test
    public void test3() {
        assertEquals(4824, Kata.findNb(135440716410000L));
    }

    @Test
    public void test4() {
        assertEquals(3568, Kata.findNb(40539911473216L));
    }

    @Test
    public void test5() {
        assertEquals(54029, Kata.findNb(2130412995495099225L));
    }
}
