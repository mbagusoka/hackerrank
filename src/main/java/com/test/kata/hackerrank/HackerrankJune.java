package com.test.kata.hackerrank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HackerrankJune {

    private HackerrankJune() {
        throw new IllegalAccessError("Util Class");
    }

    public static int fairRations(int[] B) {
        int result = 0;
        int count = 0;
        for (int n : B) {
            result += n;
        }
        if (result % 2 == 0) {
            for (int i = 0; i < B.length; i++) {
                if (i == B.length - 1 && B[i] % 2 != 0) {
                    B[i] += 1;
                    B[i - 1] += 1;
                    count += 2;
                }
                if (B[i] % 2 != 0) {
                    B[i] += 1;
                    B[i + 1] += 1;
                    count += 2;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

    public static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length - 1; i++) {
            char[] a = grid[i - 1].toCharArray();
            char[] b = grid[i].toCharArray();
            char[] c = grid[i + 1].toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (j != a.length - 1 && j != 0
                        && b[j] > b[j - 1] && b[j] > b[j + 1]
                        && b[j] > a[j] && b[j] > c[j]) {
                    b[j] = 'X';
                }
            }
            grid[i] = String.valueOf(b);
        }
        return grid;
    }

    public static int[] acmTeam(String[] topic) {
        List<Integer> integers = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        char[] firstArr;
        char[] secondArr;
        int count;
        for (int i = 0; i < topic.length - 1; i++) {
            firstArr = topic[i].toCharArray();
            for (int j = i + 1; j < topic.length; j++) {
                count = 0;
                secondArr = topic[j].toCharArray();
                for (int k = 0; k < firstArr.length; k++) {
                    if ('1' == firstArr[k] || '1' ==  secondArr[k]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
                integers.add(count);
            }
        }
        return new int[] {max, Collections.frequency(integers, max)};
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if (m1 > m2 && y1 >= y2) {
            return (m1 - m2) * 500;
        } else if (d1 > d2 && m1 >= m2 && y1 >= y2) {
            return (d1 - d2) * 15;
        } else {
            return 0;
        }
    }

    public static String superReducedString(String s) {
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        int i = 0;
        while (i < characters.size() - 1) {
            if (characters.get(i) == characters.get(i + 1)) {
                characters.remove(i + 1);
                characters.remove(i);
                i = 0;
            } else {
                i++;
            }
        }
        if (characters.isEmpty()) {
            return "Empty String";
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : characters) {
                sb.append(c);
            }
            return sb.toString();
        }
    }

    public static int camelcase(String s) {
        String[] arr = s.split("[A-Z]");
        return arr.length;
    }

    public static int minimumNumber(int n, String password) {
        String[] regex = {"[0-9]", "[a-z]", "[A-Z]", "[!@#$%^&*()\\-\\+]"};
        Pattern p;
        Matcher m;
        int regexCount = 0;
        for (String s : regex) {
            p = Pattern.compile(s);
            m = p.matcher(password);
            if (m.find()) {
                regexCount++;
            }
        }
        if (n < 6) {
            if (4 - regexCount + n >= 6) {
                return 4 - regexCount;
            } else {
                return 6 - n;
            }
        } else {
            return 4 - regexCount;
        }
    }

    public static int marsExploration(String s) {
        int result = 0;
        char[] sos = {'S', 'O' ,'S'};
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) != sos[j]) {
                result++;
            }
            if (j == sos.length - 1) {
                j = 0;
            } else {
                j++;
            }
            i++;
        }
        return result;
    }

    public static String hackerrankInString(String s) {
        String template = "hackerrank";
        int count = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == template.charAt(j)) {
                count++;
                j++;
            }
            if (count == template.length()) {
                break;
            }
        }
        return count == template.length() ? "YES" : "NO";
    }

    public static String pangrams(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        Set<Character> alphabets = new HashSet<>();
        for (char c : s.toCharArray()) {
            alphabets.add(c);
        }
        return alphabets.size() < 26 ? "not pangram" : "pangram";
    }

    public static String[] weightedUniformStrings(String s, int[] queries) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int[] values = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 21, 22, 23, 24, 25, 26};
        List<Integer> sums = new ArrayList<>();
        String[] answers = new String[queries.length];
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && s.charAt(i) == s.charAt(i - 1)) {
                sums.add(values[alphabets.indexOf(String.valueOf(s.charAt(i)))] + sums.get(i - 1));
            } else {
                sums.add(values[alphabets.indexOf(String.valueOf(s.charAt(i)))]);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            answers[i] = sums.contains(queries[i]) ? "Yes" : "No";
        }
        return answers;
    }
}
