package com.test.kata.learn;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import static com.test.kata.learn.ListManipulator.filterByPriorityList;

public class ListManipulatorTest extends TestCase {

    public void testFilterPriority_givenThreeElements_One() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        assertEquals(integers, filterByPriorityList(integers, 1));
    }

    public void testFilterPriority_givenThreeElements_Two() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> expectedIntegers = Arrays.asList(2, 3, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 2));
    }

    public void testFilterPriority_givenThreeElements_Three() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> expectedIntegers = Arrays.asList(3, 2, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 3));
    }

    public void testFilterPriority_givenFourElements_One() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        assertEquals(integers, filterByPriorityList(integers, 1));
    }

    public void testFilterPriority_givenFourElements_Two() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedIntegers = Arrays.asList(2, 3, 4, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 2));
    }

    public void testFilterPriority_givenFourElements_Three() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedIntegers = Arrays.asList(3, 4, 2, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 3));
    }

    public void testFilterPriority_givenFourElements_Four() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedIntegers = Arrays.asList(4, 3, 2, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 4));
    }

    public void testFilterPriority_givenRandomElementsAndPriority() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedIntegers = Arrays.asList(6, 7, 8, 9, 10, 5, 4, 3, 2, 1);
        assertEquals(expectedIntegers, filterByPriorityList(integers, 6));
    }
}
