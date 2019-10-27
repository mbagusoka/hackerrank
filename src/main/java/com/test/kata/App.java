package com.test.kata;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        long result = 0;
        double counter = 0;
        while (counter <= 54029) {
            result += Math.pow(counter, 3);
            counter++;
        }
        System.out.println(result);
    }
}
