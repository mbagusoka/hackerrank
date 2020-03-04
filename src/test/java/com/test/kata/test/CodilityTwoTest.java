package com.test.kata.test;

import com.test.kata.online.Codility;
import junit.framework.TestCase;

import java.util.Arrays;

public class CodilityTwoTest extends TestCase {

    public void testArmyRanksZero() {
        int[] test = {0};
        assertEquals(0, Codility.armyRanks(test));
    }

    public void testArmyRanksOne() {
        int[] test = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        assertEquals(5, Codility.armyRanks(test));
    }

    public void testArmyRanksTwo() {
        int[] test = {4, 2, 0};
        assertEquals(0, Codility.armyRanks(test));
    }

    public void testArmyRanksThree() {
        int[] test = {4, 4, 3, 3, 1, 0};
        assertEquals(3, Codility.armyRanks(test));
    }

    public void testStringCodilityZero() {
        assertEquals("", Codility.stringCodility(0, 0));
    }

    public void testStringCodilityOne() {
        String[] result = {"aabaabab", "abaabbaa", "abababaa"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(5, 3)));
    }

    public void testStringCodility() {
        String[] result = {"ababab", "aababb", "abaabb"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(3, 3)));
    }

    public void testStringCodilityThree() {
        String[] result = {"bbabb"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(1, 4)));
    }

    public void testStringCodilityFour() {
        String[] result = {"aba", "aab"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(2, 1)));
    }

    public void testStringCodilityFive() {
        String[] result = {"bab", "bba"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(1, 2)));
    }

    public void testStringCodilitySix() {
        String[] result = {"babababababababababababababababababb"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(17, 19)));
    }

    public void testStringCodilitySeven() {
        String[] result = {"bbabababababababababababababababababb"};
        assertTrue(Arrays.asList(result).contains(Codility.stringCodility(17, 20)));
    }

    public void testGambleOne() {
        assertEquals(7, Codility.gamble(8, 0));
    }

    public void testGambleTwo() {
        assertEquals(4, Codility.gamble(10, 10));
    }

    public void testGambleThree() {
        assertEquals(6, Codility.gamble(18, 2));
    }
}
