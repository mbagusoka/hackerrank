package com.test.kata.codewars;

import java.util.*;
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

    static String[] inArray(String[] array1, String[] array2) {
        List<String> stringList = new ArrayList<>();
        for (String s : array1) {
            for (String s2 : array2) {
                if (s2.contains(s)) {
                    stringList.add(s);
                    break;
                }
            }
        }
        Collections.sort(stringList);
        return stringList.toArray(new String[0]);
    }

    static int findOutlier(int[] integers) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int n : integers) {
            if (n % 2 == 0) {
                evens.add(n);
            } else {
                odds.add(n);
            }
        }
        return odds.size() > evens.size() ? evens.get(0) : odds.get(0);
    }

    static int persistence(long n) {
        if (n <= 9) {
            return 0;
        } else {
            long tempResult;
            int counter = 0;
            while (n > 9) {
                counter++;
                tempResult = 1;
                for (char c : String.valueOf(n).toCharArray()) {
                    tempResult *= Character.getNumericValue(c);
                }
                n = tempResult;
            }
            return counter;
        }
    }
}
