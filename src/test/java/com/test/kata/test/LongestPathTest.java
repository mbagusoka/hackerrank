package com.test.kata.test;

import com.test.kata.online.Codility;
import com.test.kata.online.Codility.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPathTest {

    @Test
    public void givenTestOne_whenFindLongestPath_shouldReturnCorrectResult() {
        Tree tree = new Tree(
                8,
                new Tree(2, new Tree(8, null, null), new Tree(7, null, null)),
                new Tree(6, null, null)
        );
        assertEquals(2, Codility.longestPath(tree));
    }

    @Test
    public void givenTestTwo_whenFindLongestPath_shouldReturnCorrectResult() {
        Tree tree = new Tree(
                8,
                new Tree(2, new Tree(8, new Tree(3, null, null), null), new Tree(7, null, null)),
                new Tree(6, null, null)
        );
        assertEquals(3, Codility.longestPath(tree));
    }
}
