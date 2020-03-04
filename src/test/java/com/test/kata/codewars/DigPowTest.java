package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Assert;
import org.junit.Test;

public class DigPowTest {

    @Test
    public void Test1() {
        Assert.assertEquals(1, Codewars.digPow(89, 1));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, Codewars.digPow(92, 1));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(51, Codewars.digPow(46288, 3));
    }
}
