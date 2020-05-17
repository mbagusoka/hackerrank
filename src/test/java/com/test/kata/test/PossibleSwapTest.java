package com.test.kata.test;

import com.test.kata.online.Codility;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PossibleSwapTest {

    @Test
    public void givenTestOne_whenPossibleSwap_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 5, 3, 3, 7};
        assertTrue(Codility.possibleSwap(arr));
    }

    @Test
    public void givenTestTwo_whenPossibleSwap_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 3, 5, 3, 4};
        assertFalse(Codility.possibleSwap(arr));
    }

    @Test
    public void givenTestThree_whenPossibleSwap_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 3, 5};
        assertTrue(Codility.possibleSwap(arr));
    }
}
