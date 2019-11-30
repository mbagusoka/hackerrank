package com.test.kata.learn;

import java.util.Set;
import java.util.TreeSet;

public final class Recursive {

    private Recursive() {
        throw new IllegalAccessError("Util Class;");
    }

    public static Set<String> permutation(String input) {
        Set<String> set = new TreeSet<>();
        if (input.equals("")) {
            return set;
        }
        char a = input.charAt(0);
        if (input.length() > 1) {
            input = input.substring(1);
            Set<String> permSet = permutation(input);
            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        } else {
            set.add(a + "");
        }
        return set;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static long power(int number, int power) {
        return power(number, power, false);
    }

    private static long power(int number, int power, boolean minus) {
        if (0 > number) {
            minus = true;
        }
        if (0 != power) {
            return number * power(number, power - 1, minus);
        } else {
            return minus ? -1 : 1;
        }
    }
}
