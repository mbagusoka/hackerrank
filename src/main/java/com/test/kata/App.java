package com.test.kata;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        System.out.println(power(8, 3));
    }

    private static long power(long number, long power) {
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }
}
