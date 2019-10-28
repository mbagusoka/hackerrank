package com.test.kata.codewars;

import org.junit.Assert;
import org.junit.Test;

public class WhichAreInTest {

    @Test
    public void test1() {
        String[] a = new String[] {"arp", "live", "strong"};
        String[] b = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[] {"arp", "live", "strong"};
        Assert.assertArrayEquals(r, Kata.inArray(a, b));
    }
}
