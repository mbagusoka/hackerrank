package com.test.kata.hackerrank;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class HackerrankOctober {

    private HackerrankOctober() {}

    public static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int temp = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[j] == i + 1) {
                    temp = j + 1;
                    break;
                }
            }
            for (int k = 0; k < p.length; k++) {
                if (p[k] == temp) {
                    result[i] = k + 1;
                    break;
                }
            }
        }
        return result;
    }

    public static int beautifulTriplets(int d, int[] arr) {
        int triplets = 0;
        Set<Integer> integerSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int temp1;
        int temp2;
        for (int value : arr) {
            temp1 = value + d;
            temp2 = temp1 + d;
            if (integerSet.containsAll(Arrays.asList(temp1, temp2))) {
                triplets++;
            }
        }
        return triplets;
    }
}
