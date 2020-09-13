package com.test.kata.online;

import com.test.kata.struct.ListNode;

import java.util.HashMap;
import java.util.Map;

public final class LeetCode {

    private LeetCode() {
    }

    private static final Map<String, Integer> ROMAN_MAP = new HashMap<>();

    static {
        ROMAN_MAP.put("I", 1);
        ROMAN_MAP.put("V", 5);
        ROMAN_MAP.put("X", 10);
        ROMAN_MAP.put("L", 50);
        ROMAN_MAP.put("C", 100);
        ROMAN_MAP.put("D", 500);
        ROMAN_MAP.put("M", 1000);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder builder = new StringBuilder();
        int firstDigit = getDigit(builder, l1);
        builder = new StringBuilder();
        int secondDigit = getDigit(builder, l2);
        char[] resultArr = String.valueOf(firstDigit + secondDigit).toCharArray();
        ListNode baseNode = new ListNode();
        int baseIndex = resultArr.length - 1;
        buildNode(baseNode, resultArr, baseIndex);
        return baseNode;
    }

    private static void buildNode(ListNode node, char[] arr, int index) {
        if (index < 1) {
            node.val = Integer.parseInt(String.valueOf(arr[index]));
        } else {
            node.val = Integer.parseInt(String.valueOf(arr[index]));
            node.next = new ListNode(Integer.parseInt(String.valueOf(arr[index - 1])));
            if (index - 2 > -1) {
                node.next.next = new ListNode();
                buildNode(node.next.next, arr, index - 2);
            }
        }
    }

    private static int getDigit(StringBuilder builder, ListNode node) {
        if (node.next == null) {
            builder.append(node.val);
            return Integer.parseInt(builder.reverse().toString());
        } else {
            builder.append(node.val);
            return getDigit(builder, node.next);
        }
    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            result += ROMAN_MAP.get(String.valueOf(arr[i]));
            if ((arr[i] == 'X' || arr[i] == 'V') && (i != 0 && arr[i - 1] == 'I')) {
                result -= ROMAN_MAP.get(String.valueOf('I')) * 2;
            }
            if ((arr[i] == 'L' || arr[i] == 'C') && (i != 0 && arr[i - 1] == 'X')) {
                result -= ROMAN_MAP.get(String.valueOf('X')) * 2;
            }
            if ((arr[i] == 'D' || arr[i] == 'M') && (i != 0 && arr[i - 1] == 'C')) {
                result -= ROMAN_MAP.get(String.valueOf('C')) * 2;
            }
        }
        return result;
    }
}
