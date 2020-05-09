package com.test.kata.learn;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void givenEmptyArray_whenSort_shouldReturnSameArray() {
        int[] arr = new int[0];
        assertArrayEquals(arr, Learn.selectionSort(arr));
    }

    @Test
    public void givenOrderedArray_whenSort_shouldReturnSameArray() {
        int[] arr = new int[]{1, 2, 3};
        assertArrayEquals(arr, Learn.selectionSort(arr));
    }

    @Test
    public void givenUnorderedArray_whenSort_shouldReturnOrderedArray() {
        int[] arr = new int[]{2, 3, 1};
        assertArrayEquals(new int[]{1, 2, 3}, Learn.selectionSort(arr));
    }
}
