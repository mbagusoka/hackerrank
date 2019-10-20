package com.test.kata.test;

import junit.framework.TestCase;

import java.util.Arrays;

public class CodilityTwoTest extends TestCase {

    public void testArmyRanksZero() {
        int[] test = {0};
        assertEquals(0, CodilityTwo.armyRanks(test));
    }

    public void testArmyRanksOne() {
        int[] test = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        assertEquals(5, CodilityTwo.armyRanks(test));
    }

    public void testArmyRanksTwo() {
        int[] test = {4, 2, 0};
        assertEquals(0, CodilityTwo.armyRanks(test));
    }

    public void testArmyRanksThree() {
        int[] test = {4, 4, 3, 3, 1, 0};
        assertEquals(3, CodilityTwo.armyRanks(test));
    }

    public void testStringCodilityZero() {
        assertEquals("", CodilityTwo.stringCodility(0, 0));
    }

    public void testStringCodilityOne() {
        String[] result = {"aabaabab", "abaabbaa", "abababaa"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(5, 3)));
    }

    public void testStringCodilityTwo() {
        String[] result = {"ababab", "aababb", "abaabb"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(3, 3)));
    }

    public void testStringCodilityThree() {
        String[] result = {"bbabb"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(1, 4)));
    }

    public void testStringCodilityFour() {
        String[] result = {"aba", "aab"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(2, 1)));
    }

    public void testStringCodilityFive() {
        String[] result = {"bab", "bba"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(1, 2)));
    }

    public void testStringCodilitySix() {
        String[] result = {"babababababababababababababababababb"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(17, 19)));
    }

    public void testStringCodilitySeven() {
        String[] result = {"bbabababababababababababababababababb"};
        assertTrue(Arrays.asList(result).contains(CodilityTwo.stringCodility(17, 20)));
    }

    public void testGambleOne() {
        assertEquals(7, CodilityTwo.gamble(8, 0));
    }

    public void testGambleTwo() {
        assertEquals(4, CodilityTwo.gamble(10, 10));
    }

    public void testGambleThree() {
        assertEquals(6, CodilityTwo.gamble(18, 2));
    }
}
