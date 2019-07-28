package com.test.kata.test;

import java.util.*;
import java.util.stream.Collectors;

public final class BukaLapak {

    private BukaLapak() {
        throw new IllegalAccessError("Util Class");
    }

    /**
     * Test no. 1
     * @param ranks array of ranks
     * @return int number of direct subordinates
     */
    public static int armyRanks(int[] ranks) {
        int count = 0;
        List<Integer> integers = Arrays.stream(ranks).boxed().collect(Collectors.toList());
        HashSet<Integer> integerSet = new HashSet<>(integers);
        for (int n : integerSet) {
            if (integers.contains(n)) {
                count += Collections.frequency(integers, n - 1);
            }
        }
        return count;
    }

    /**
     * Test no. 2
     * 2 test cases not passed
     * NOTE: after refactored, it must be pass all test cases
     * @param A String A
     * @param B String B
     * @return String combination which the consecutive strings less than 3
     */
    public static String stringCodility(int A, int B) {
        String result = "";
        String a = "a";
        String b = "b";
        if (A > B && A - B <= 3) {
            return minLessThanTwo(A, B, a, b);
        } else if (B > A && B - A <= 3) {
            return minLessThanTwo(B, A, b, a);
        } else if (A > B) {
            return moreThanString(A, B, a, b);
        } else if (B > A) {
            return moreThanString(B, A, b, a);
        } else {
            for (int i = 0; i < A + B; i++) {
                if (i % 2 == 0) {
                    result = result.concat(a);
                } else {
                    result = result.concat(b);
                }
            }
            return result;
        }
    }

    private static String minLessThanTwo(int x, int y, String xS, String yS) {
        String result = "";
        int countX = 0;
        for (int i = 0; i < y * 2; i++) {
            if (i % 2 == 0) {
                result = result.concat(xS);
                countX++;
            } else {
                result = result.concat(yS);
            }
        }
        return countSpare(result, xS, countX, x);
    }

    private static String moreThanString(int x, int y, String xS, String yS) {
        String result = "";
        int count = 0;
        int countY = 0;
        int i = 0;
        while (i < x) {
            if (count > 1) {
                result = result.concat(yS);
                countY++;
                count = 0;
            } else {
                result = result.concat(xS);
                count++;
                i++;
            }
        }
        return countSpare(result, yS, countY, y);
    }

    private static String countSpare(String result, String s, int count, int actual) {
        if (count < actual) {
            for (int i = 0; i < actual - count; i++) {
                if (i > 1) {
                    result = s.concat(result);
                } else {
                    result = result.concat(s);
                }
            }
        }
        return result;
    }

    /**
     * Test no. 3
     * 3 test cases not passed
     * @param N number of points won
     * @param K number of maximum all-in
     * @return int minimum rounds
     */
    public static int gamble(int N, int K) {
        int rounds = 0;
        if (K == 0) {
            return N - 1;
        } else {
            int count = 0;
            int i = 0;
            while (N > 1) {
                if (i % 2 == 0 && count < K) {
                    N = N / 2;
                    rounds++;
                    count++;
                } else {
                    N -= 1;
                    rounds++;
                }
                i++;
            }
            return rounds;
        }
    }
}
