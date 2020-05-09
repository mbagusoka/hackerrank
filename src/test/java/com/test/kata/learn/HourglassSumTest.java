package com.test.kata.learn;

import com.test.kata.online.Hackerrank;
import org.junit.Assert;
import org.junit.Test;

public class HourglassSumTest {

    @Test
    public void testOne() {
        int[][] arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Assert.assertEquals(19, Hackerrank.hourglassSum(arr));
    }
}
