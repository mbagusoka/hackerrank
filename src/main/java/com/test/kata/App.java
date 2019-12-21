package com.test.kata;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        List<String> allString = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> notAllString = Arrays.asList("a", "b", "c", "d");
        List<String> delta = allString.stream().filter(all -> !notAllString.contains(all)).collect(Collectors.toList());
        System.out.println(delta);
    }
}
