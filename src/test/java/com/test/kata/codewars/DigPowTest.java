package com.test.kata.codewars;

import org.junit.Assert;
import org.junit.Test;

public class DigPowTest {

    @Test
    public void Test1() {
        Assert.assertEquals(1, Kata.digPow(89, 1));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, Kata.digPow(92, 1));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(51, Kata.digPow(46288, 3));
    }
}
