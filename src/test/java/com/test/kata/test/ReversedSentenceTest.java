package com.test.kata.test;

import com.test.kata.online.Codility;
import org.junit.Assert;
import org.junit.Test;

public class ReversedSentenceTest {

    @Test
    public void givenTestOne_whenReversed_shouldReturnCorrectResult() {
        String s = "we are test coders";
        Assert.assertEquals("ew era tset sredoc", Codility.reversed(s));
    }

    @Test
    public void givenTestTwo_whenReversed_shouldReturnCorrectResult() {
        String s = "grilled chicken";
        Assert.assertEquals("dellirg nekcihc", Codility.reversed(s));
    }
}
