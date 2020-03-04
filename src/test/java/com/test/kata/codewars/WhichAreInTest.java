package com.test.kata.codewars;

import com.test.kata.online.Codewars;
import org.junit.Assert;
import org.junit.Test;

public class WhichAreInTest {

    @Test
    public void test1() {
        String[] a = new String[] {"arp", "live", "strong"};
        String[] b = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[] {"arp", "live", "strong"};
        Assert.assertArrayEquals(r, Codewars.inArray(a, b));
    }
}
