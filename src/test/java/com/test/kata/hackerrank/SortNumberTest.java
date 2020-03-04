package com.test.kata.hackerrank;

import com.test.kata.online.Hackerrank;
import junit.framework.TestCase;
import org.junit.Assert;

public class SortNumberTest extends TestCase {

    public void testSortZero() {
        Assert.assertArrayEquals(new int[] {0}, Hackerrank.sortNumber(new int[] {0}));
    }

    public void testSorted() {
        Assert.assertArrayEquals(new int[] {1, 2}, Hackerrank.sortNumber(new int[] {1, 2}));
    }

    public void testUnsortedOne() {
        Assert.assertArrayEquals(new int[] {1, 2, 3}, Hackerrank.sortNumber(new int[] {2, 3, 1}));
    }

    public void testUnsortedTwo() {
        int[] test = {2, 3, 5, 6, 1, 4, 8, 10, 9, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(result, Hackerrank.sortNumber(test));
    }

    public void testSortedDuplicate() {
        int[] test = {2, 2, 2};
        int[] result = {2, 2, 2};
        Assert.assertArrayEquals(result, Hackerrank.sortNumber(test));
    }

    public void testUnsortedDuplicate() {
        int[] test = {2, 3, 3, 4, 1, 8, 5, 6};
        int[] result = {1, 2, 3, 3, 4, 5, 6, 8};
        Assert.assertArrayEquals(result, Hackerrank.sortNumber(test));
    }
}
