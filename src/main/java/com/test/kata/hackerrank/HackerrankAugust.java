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
}
