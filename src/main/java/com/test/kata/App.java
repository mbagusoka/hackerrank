package com.test.kata;

import com.test.kata.hackerrank.HackerrankOctober;

import java.io.IOException;
import java.util.Arrays;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(HackerrankOctober.permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }
}
