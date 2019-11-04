package com.test.kata;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        String a = "a.b.c";
        String[] b = a.split("\\.");
        for (String s : b) {
            System.out.println(s);
        }
    }
}
