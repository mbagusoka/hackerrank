package com.test.kata.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public final class HackerrankSeptember {

    private HackerrankSeptember() {
        throw new IllegalAccessError("Util Class");
    }

    public static String gameOfThrones(String s) {
        List<Character> characterList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Set<Character> characterSet = new HashSet<>(characterList);
        int odd = 0;
        for (char c : characterSet) {
            if (Collections.frequency(characterList, c) % 2 != 0) {
                odd++;
            }
        }
        return odd < 2 ? "YES" : "NO";
    }

    public static int stringConstruction(String s) {
        int price = 0;
        Set<Character> characterSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (characterSet.add(c)) {
                price++;
            }
        }
        return price;
    }

    public static String twoStrings(String s1, String s2) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = false;
        for (char c : alphabet.toCharArray()) {
            if (s1.contains(String.valueOf(c)) && s2.contains(String.valueOf(c))) {
                flag = true;
                break;
            }
        }
        return flag ? "YES" : "NO";
    }

    public static int alternate(String s) {
        int minimal = Integer.MAX_VALUE;
        return minimal;
    }
}
