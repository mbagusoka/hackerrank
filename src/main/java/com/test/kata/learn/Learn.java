package com.test.kata.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("squid:S106")
public final class Learn {

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

    static int[] selectionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void pyramid(String token) {
        for (int i = 0, j = token.length() - 1, l = -1; i < token.length(); i++, j--, l += 2) {
            if (i != token.length() - 1) {
                notLastChar(token, i, j, l);
            } else {
                doLastChar(token, i);
            }
        }
    }

    private static void notLastChar(String token, int i, int j, int l) {
        for (int k = 0; k < j; k++) {
            System.out.print(" ");
        }
        System.out.print(token.charAt(i));
        if (i > 0) {
            for (int m = 0; m < l; m++) {
                System.out.print(" ");
            }
            System.out.print(token.charAt(i));
        }
        System.out.println();
    }

    private static void doLastChar(String token, int i) {
        for (int o = 0; o < token.length() * 2; o++) {
            if (o % 2 == 0) {
                System.out.print(token.charAt(i));
            } else {
                System.out.print(" ");
            }
        }
    }
}
