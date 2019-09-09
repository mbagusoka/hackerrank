package com.test.kata.hackerrank;

public final class HackerrankAugust {

    private HackerrankAugust() {
        throw new IllegalAccessError("Util Class");
    }

    public static int gemstones(String[] arr) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int gemstones = 0;
        int temp;
        for (char c : alphabet.toCharArray()) {
            temp = 0;
            for (String s : arr) {
                if (s.contains(String.valueOf(c))) {
                    temp++;
                }
            }
            if (arr.length == temp) {
                gemstones++;
            }
        }
        return gemstones;
    }

    public static int beautifulBinaryString(String b) {
        int change = 0;
        char[] chars = b.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (i + 2 <= chars.length - 1 && chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0') {
                change++;
                i += 2;
            } else {
                i++;
            }
        }
        return change;
    }

    public static String caesarCipher(String s, int k) {
        int swap = k % 26;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String lowerCaseCiphered = alphabets.substring(swap).concat(alphabets.substring(0, swap));
        String upperCaseCiphered = lowerCaseCiphered.toUpperCase();
        char[] arr = s.toCharArray();
        int index;
        String alphabet;
        for (int i = 0; i < arr.length; i++) {
            alphabet = String.valueOf(arr[i]);
            if (alphabets.contains(alphabet)) {
                index = alphabets.indexOf(alphabet);
                arr[i] = lowerCaseCiphered.toCharArray()[index];
            } else if (alphabets.contains(alphabet.toLowerCase())) {
                index = alphabets.indexOf(alphabet.toLowerCase());
                arr[i] = upperCaseCiphered.toCharArray()[index];
            }
        }
        return new String(arr);
    }

    public static int theLoveLetterMystery(String s) {
        int changes = 0;
        char[] arr = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                changes += Math.abs(arr[i] - arr[j]);
            }
        }
        return changes;
    }

    public static int anagram(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        } else {
            int changes = 0;
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            char[] s1Chars = s1.toCharArray();
            int index;
            for (char c : s1Chars) {
                index = s2.indexOf(c);
                if (index == -1) {
                    changes++;
                } else {
                    s2 = s2.substring(0, index).concat(s2.substring(index + 1));
                }
            }
            return changes;
        }
    }

    public static int makingAnagrams(String s1, String s2) {
        int changes = Math.abs(s1.length() - s2.length());
        if (s1.length() > s2.length()) {
            return getChanges(changes, s2.toCharArray(), s1);
        } else {
            return getChanges(changes, s1.toCharArray(), s2);
        }
    }

    private static int getChanges(int changes, char[] arr, String s) {
        int index;
        for (char c : arr) {
            index = s.indexOf(c);
            if (index == -1) {
                changes += 2;
            } else {
                s = s.substring(0, index).concat(s.substring(index + 1));
            }
        }
        return changes;
    }
}
