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
}
