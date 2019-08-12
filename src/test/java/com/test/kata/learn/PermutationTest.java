package com.test.kata.learn;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PermutationTest extends TestCase {

    public void testPermutationZero() {
        assertEquals(0, Recursive.permutation("").size());
    }

    public void testPermutationOne() {
        String test = "ab";
        Set<String> results = new TreeSet<>(Arrays.asList("ab", "ba"));
        assertEquals(results, Recursive.permutation(test));
    }

    public void testPermutationTwo() {
        String test = "abc";
        Set<String> results = new TreeSet<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
        assertEquals(results, Recursive.permutation(test));
    }
}
