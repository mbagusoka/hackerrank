package com.test.kata;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            strings.add("dummy");
        }
        usingLambda(strings);
        testForEach(strings);
        testNative(strings);
    }

    private static void usingLambda(List<String> strings) {
        long start = System.currentTimeMillis();
        strings.forEach(s -> {

        });
        System.out.println("Lambda: " + (System.currentTimeMillis() - start));
    }

    private static void testNative(List<String> strings) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < strings.size(); i++) {

        }
        System.out.println("Native: " + (System.currentTimeMillis() - start));
    }

    private static void testForEach(List<String> strings) {
        long start = System.currentTimeMillis();
        for (String string : strings) {

        }
        System.out.println("For Loop: " + (System.currentTimeMillis() - start));
    }
}