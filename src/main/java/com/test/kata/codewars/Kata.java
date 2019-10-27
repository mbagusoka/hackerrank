package com.test.kata.codewars;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Kata {

    private Kata() {}

    static long findNb(long m) {
        long total = 0;
        int counter = 0;
        while (total < m) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }
        return m == total ? counter : -1;
    }

    static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return String.valueOf(word.charAt(word.length() / 2));
        }
    }

    static int convertBinaryArrayToInt(List<Integer> asList) {
        StringBuilder builder = new StringBuilder();
        for (int x : asList) {
            builder.append(x);
        }
        return Integer.parseInt(builder.toString(), 2);
    }

    static String encode(String word) {
        List<Character> charList = word.toLowerCase().chars()
                .mapToObj(x -> (char) x).collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        for (char c : charList) {
            if (Collections.frequency(charList, c) > 1) {
                builder.append(")");
            } else {
                builder.append("(");
            }
        }
        return builder.toString();
    }

    static int countBits(int n) {
        String binary = Integer.toBinaryString(n);
        int counter = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                counter++;
            }
        }
        return counter;
    }

    static boolean isIsogram(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (!characterSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
