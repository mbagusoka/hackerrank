package com.test.kata.learn;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateTest extends TestCase {

    private List<Integer> integers;
    private int[] arr;

    @Override
    protected void setUp() {
        integers = Arrays.asList(1, 2, 3);
        arr = new int[] {1, 2, 3};
    }

    public void testRotateEmpty() {
        assertEquals(Collections.emptyList(), Learn.rotate(Collections.emptyList(), 0));
    }

    public void testRotateOne() {
        List<Integer> result = Arrays.asList(3, 1, 2);

        assertEquals(result, Learn.rotate(integers, 1));
    }

    public void testRotateTwo() {
        List<Integer> result = Arrays.asList(2, 3, 1);

        assertEquals(result, Learn.rotate(integers, 2));
    }

    public void testRotateFour() {
        List<Integer> result = Arrays.asList(3, 1, 2);

        assertEquals(result, Learn.rotate(integers, 4));
    }

    public void testRotateArrEmpty() {
        Assert.assertArrayEquals(arr, Learn.rotate(arr, 0));
    }

    public void testRotateArrOne() {
        int[] result = new int[] {3, 1, 2};

        Assert.assertArrayEquals(result, Learn.rotate(arr, 1));
    }

    public void testRotateArrTwo() {
        int[] result = new int[] {2, 3, 1};

        Assert.assertArrayEquals(result, Learn.rotate(arr, 2));
    }

    public void testRotateArrFour() {
        int[] result = new int[] {3, 1, 2};

        Assert.assertArrayEquals(result, Learn.rotate(arr, 4));
    }
}
