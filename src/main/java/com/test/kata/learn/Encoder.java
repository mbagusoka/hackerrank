package com.test.kata.learn;

import java.util.HashMap;
import java.util.Map;

public final class Encoder {

    private Encoder() {}

    private static final Map<Integer, String> HEXA_MAP = constructHexaMap();

    private static Map<Integer, String> constructHexaMap() {
        Map<Integer, String> hexaMap = new HashMap<>();
        hexaMap.put(0, "E");
        hexaMap.put(1, "f");
        hexaMap.put(2, "2");
        hexaMap.put(3, "5");
        hexaMap.put(4, "7");
        hexaMap.put(5, "9");
        hexaMap.put(6, "T");
        hexaMap.put(7, "u");
        hexaMap.put(8, "V");
        hexaMap.put(9, "w");
        hexaMap.put(10, "X");
        hexaMap.put(11, "y");
        hexaMap.put(12, "Z");
        hexaMap.put(13, "M");
        hexaMap.put(14, "n");
        hexaMap.put(15, "O");
        return hexaMap;
    }

    public static String convertHexaModified(String token) {
        if (null == token || 0 == token.trim().length() || isAnyAlphabet(token)) {
            return token;
        }
        String[] arr = token.split("(?<=\\G..)");
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            int n = Integer.parseInt(s);
            int divided = n / 16;
            builder.append(HEXA_MAP.get(divided));
            if (n > 9) {
                int remainder = n % 16;
                builder.append(HEXA_MAP.get(remainder));
            }
        }
        return builder.toString();
    }

    private static boolean isAnyAlphabet(String token) {
        return token.chars().anyMatch(Character::isAlphabetic);
    }
}
