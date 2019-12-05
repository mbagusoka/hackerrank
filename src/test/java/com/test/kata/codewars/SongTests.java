package com.test.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTests {

    @Test
    public void Test1() {
        assertEquals("ABC", Kata.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", Kata.songDecoder("RWUBWUBWUBLWUB"));
    }

}
