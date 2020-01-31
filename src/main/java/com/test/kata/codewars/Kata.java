package com.test.kata.codewars;

import java.util.*;
import java.util.stream.Collectors;

final class Kata {

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

    static int digPow(int n, int p) {
        int result = 0;
        String digit = String.valueOf(n);
        for (int i = 0; i < digit.length(); i++) {
            result += Math.pow(Character.getNumericValue(digit.charAt(i)), p++);
        }
        if (result >= n && result % n == 0) {
            return result / n;
        } else {
            return -1;
        }
    }

    static boolean isPrime(int num) {
        if (num <  2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static String songDecoder(String song) {
        return song.replace("WUB", " ").trim().replaceAll(" +", " ");
    }

    static int greedy(int[] dice) {
        Map<Integer, Integer> numberMaps = getNumbersMap(dice);
        int result = 0;
        for (int i = 1; i <= 6; i++) {
            result = countResult(numberMaps, result, i);
        }
        return result;
    }

    private static int countResult(Map<Integer, Integer> numberMaps, int result, int index) {
        if (null != numberMaps.get(index)) {
            int number = numberMaps.get(index);
            if (number >= 3) {
                if (1 == index) {
                    result += 1000;
                } else {
                    result += index * 100;
                }
                number -= 3;
            }
            if (number > 0 && (index == 1 || index == 5)) {
                if (index == 1 ) {
                    result += (number * 100);
                } else {
                    result += (number * 50);
                }
            }
        }
        return result;
    }

    private static Map<Integer, Integer> getNumbersMap(int[] dice) {
        Map<Integer, Integer> numberMaps = new HashMap<>();
        for (int n : dice) {
            if (numberMaps.containsKey(n)) {
                numberMaps.put(n, numberMaps.get(n) + 1);
            } else {
                numberMaps.put(n, 1);
            }
        }
        return numberMaps;
    }

    static int sequence(int[] arr) {
        if (isSequenceInvalid(arr)) return 0;
        int temp = 0;
        int sum = Integer.MIN_VALUE;
        for (int n : arr) {
            temp = Math.max(n, temp + n);
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }

    private static boolean isSequenceInvalid(int[] ints) {
        if (0 == ints.length) {
            return true;
        }
        boolean isAllNegative = true;
        for (int n : ints) {
            if (n > 0) {
                isAllNegative = false;
                break;
            }
        }
        return isAllNegative;
    }
}
