package com.test.kata.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Learn {

    private Learn() {}

    @SuppressWarnings("squid:S5413")
    static List<Integer> rotate(List<Integer> integers, int swapCount) {
        if (null == integers || integers.isEmpty()) {
            return Collections.emptyList();
        }
        swapCount = swapCount % integers.size();
        integers = new ArrayList<>(integers);
        Integer element;
        for (int i = 0; i < swapCount; i++) {
            element = integers.remove(integers.size() - 1);
            integers.add(0, element);
        }
        return integers;
    }

    static int[] rotate(int[] arr, int swapCount) {
        if (1 > arr.length) {
            return arr;
        }
        swapCount = swapCount % arr.length;
        int[] temp = getTempArr(arr, swapCount);
        int[] result = new int[arr.length];
        int tempCounter = temp.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (tempCounter < 0) {
                result[i] = arr[i - swapCount];
            } else {
                result[i] = temp[tempCounter];
                tempCounter--;
            }
        }
        return result;
    }

    private static int[] getTempArr(int[] arr, int swapCount) {
        int[] temp = new int[swapCount];
        for (int i = arr.length - 1, j = 0; j < swapCount; i--, j++) {
            temp[j] = arr[i];
        }
        return temp;
    }

    static int kadane(int[] arr) {
        if (0 == arr.length) {
            return -1;
        }
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int n : arr) {
            localMax = Math.max(n, localMax + n);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }

    static String luhn(String token) {
        if (null == token || 0 == token.trim().length()) {
            return "";
        }
        int sum = getLuhnSum(token);
        return String.format("%s%s", token, 10 - (sum % 10));
    }

    static boolean luhnValidation(String token) {
        if (null == token || 0 == token.trim().length()) {
            return false;
        }
        int sum = getLuhnSum(token);
        return sum % 10 == 0;
    }

    private static int getLuhnSum(String token) {
        int sum = 0;
        int indexInt;
        int temp;
        for (int i = 0; i < token.length(); i++) {
            indexInt = Integer.parseInt(String.valueOf(token.charAt(i)));
            if (0 == (i + 1) % 2) {
                temp = indexInt * 2;
                sum += temp > 9 ? temp % 10 + 1 : temp;
            } else {
                sum += indexInt;
            }
        }
        return sum;
    }
}
