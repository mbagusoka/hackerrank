package com.test.kata;

public class App {

    @SuppressWarnings("squid:S106")
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetCiphered = alphabet.substring(3).concat(alphabet.substring(0, 3));
        System.out.println(alphabetCiphered);
    }
}
