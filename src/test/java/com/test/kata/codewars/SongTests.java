package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTests {

    @Test
    public void Test1() {
        assertEquals("ABC", Codewars.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", Codewars.songDecoder("RWUBWUBWUBLWUB"));
    }

}
