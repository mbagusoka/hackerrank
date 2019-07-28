package com.test.kata.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public final class Codility {

    private Codility() {
        throw new IllegalAccessError("Util Class");
    }

    public static int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        if (!binary.contains("0") || frequency('1', binary) <= 1) {
            return 0;
        } else {
            int count = 0;
            int max = Integer.MIN_VALUE;
            binary = binary.substring(0, binary.lastIndexOf('1'));
            for (char c : binary.toCharArray()) {
                if (c == '0') {
                    count++;
                } else {
                    count = 0;
                }
                if (count > max) {
                    max = count;
                }
            }
            return max;
        }
    }

    public static int frequency(char searchChar, String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == searchChar) {
                count++;
            }
        }
        return count;
    }

    public static int oddOccurrencesInArray(int[] A) {
        HashSet<Integer> duplicates = new HashSet<>();
        int element = -1;
        for (int n : A) {
            if (duplicates.add(n)) {
                element = n;
            }
        }
        return element;
    }


    public static int smallestInteger(int[] arr) {
        List<Integer> integers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(integers);
        return integers.get(0);
    }
}
