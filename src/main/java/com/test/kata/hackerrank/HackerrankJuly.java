package com.test.kata.hackerrank;

public final class HackerrankJuly {

    private HackerrankJuly() {
        throw new IllegalAccessError("Util Class");
    }

    public static int alternatingCharacters(String s) {
        int deletion = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                deletion++;
            }
        }
        return deletion;
    }

    public static String funnyString(String s) {
        char[] arr = s.toCharArray();
        int[] asciiArr = new int[arr.length];
        int[] reverseArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            asciiArr[i] = (int) arr[i];
            reverseArr[i] = (int) arr[j];
        }
        int[] diffArrOri = new int[asciiArr.length - 1];
        int[] diffArrReverse = new int[reverseArr.length - 1];
        int equalsFlag = 0;
        for (int i = 1; i < asciiArr.length; i++) {
            diffArrOri[i - 1] = Math.abs(asciiArr[i] - asciiArr[i - 1]);
            diffArrReverse[i - 1] = Math.abs(reverseArr[i] - reverseArr[i - 1]);
            if (diffArrOri[i - 1] != diffArrReverse[i - 1]) {
                equalsFlag++;
                break;
            }
        }
        return equalsFlag > 0 ? "Not Funny" : "Funny";
    }
}
