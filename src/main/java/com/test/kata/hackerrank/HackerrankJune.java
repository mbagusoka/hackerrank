package com.test.kata.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HackerrankJune {

    private HackerrankJune() {
        throw new IllegalAccessError("Util Class");
    }

    public static int fairRations(int[] B) {
        int result = 0;
        int count = 0;
        for (int n : B) {
            result += n;
        }
        if (result % 2 == 0) {
            for (int i = 0; i < B.length; i++) {
                if (i == B.length - 1 && B[i] % 2 != 0) {
                    B[i] += 1;
                    B[i - 1] += 1;
                    count += 2;
                }
                if (B[i] % 2 != 0) {
                    B[i] += 1;
                    B[i + 1] += 1;
                    count += 2;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

    public static String[] cavityMap(String[] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (i != grid.length - 1 && i != 0) {
                char[] a = grid[i - 1].toCharArray();
                char[] b = grid[i].toCharArray();
                char[] c = grid[i + 1].toCharArray();
                for (int j = 0; j < a.length; j++) {
                    if (j != a.length - 1 && j != 0
                            && b[j] > b[j - 1] && b[j] > b[j + 1]
                            && b[j] > a[j] && b[j] > c[j]) {
                        b[j] = 'X';
                    }
                }
                grid[i] = String.valueOf(b);
            }
        }
        return grid;
    }

    public static int[] acmTeam(String[] topic) {
        List<Integer> integers = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        char[] firstArr;
        char[] secondArr;
        int count;
        for (int i = 0; i < topic.length - 1; i++) {
            firstArr = topic[i].toCharArray();
            for (int j = i + 1; j < topic.length; j++) {
                count = 0;
                secondArr = topic[j].toCharArray();
                for (int k = 0; k < firstArr.length; k++) {
                    if ('1' == firstArr[k] || '1' ==  secondArr[k]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
                integers.add(count);
            }
        }
        return new int[] {max, Collections.frequency(integers, max)};
    }
}
