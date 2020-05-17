package com.test.kata.learn;

import com.test.kata.online.Hackerrank;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountTripletsTest {

    @Test
    public void testOne() {
        List<Long> arr = Arrays.asList(1L, 2L, 2L, 4L);
        assertEquals(2, Hackerrank.countTriplets(arr, 2));
    }
}
