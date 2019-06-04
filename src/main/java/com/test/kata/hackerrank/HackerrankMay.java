package com.test.kata.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class HackerrankMay {

    private HackerrankMay() {
        throw new IllegalAccessError("Util Class");
    }

    public static int viralAdvertising(int n) {
        int cumulative = 0;
        int people = 5;
        for (int i = 1; i <= n; i++) {
            cumulative = cumulative + people / 2;
            people = people / 2 * 3;
        }
        return cumulative;
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int a = (s + m - 1) % n;
        return (a == 0 ? n : a);
    }

    public static int decimalRepresentation(int a, int b) {
        String aString = String.valueOf(a);
        char[] chars = String.valueOf(b).toCharArray();
        int result = -1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (new StringBuilder().append(chars[i]).append(chars[i + 1]).toString().equals(aString)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] arrResult = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arrResult[(i + k) % a.length] = a[i];
        }
        for (int i = 0; i < queries.length; i++) {
            queries[i] = arrResult[queries[i]];
        }
        return queries;
    }

    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        for (int i = k; i < c.length; i += k) {
            energy = c[i] == 0 ? energy - 1 : energy - 3;
        }
        return c[0] == 0 ? energy - 1 : energy - 3;
    }

    public static int findDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int count = 0;
        for (char c : chars) {
            if (!String.valueOf(c).equals("0") && n % Integer.parseInt(String.valueOf(c)) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(n);
        BigInteger initial = BigInteger.valueOf(n - 1L);
        for (int i = 1; i < n; i++) {
            result = result.multiply(initial);
            initial = initial.subtract(BigInteger.ONE);
        }
        System.out.println(result);
    }

    public static int squares(int a, int b) {
        int numOfSquares = 0;
        int x = 1;
        while (x * x < a) {
            x++;
        }
        while (x * x <= b) {
            numOfSquares++;
            x++;
        }
        return numOfSquares;
    }

    public static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> integers = new ArrayList<>();
        integers.add(arr.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                integers.add(arr.length - i);
            }
        }
        int[] result = new int[integers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integers.get(i);
        }
        return result;
    }

    public static long repeatedString(String s, long n) {
        long size = n / (long) s.length();
        long left = n % (long) s.length();
        String leftString = s.substring(0, (int) left);
        if (s.length() == 1 && "a".equals(s)) {
            return n;
        } else {
            long count = (long) s.length() - (long) s.replace("a", "").length();
            long countLeft = (long) leftString.length() - (long) leftString.replace("a", "").length();
            return (size * count) + countLeft;
        }
    }

    public static int jumpingOnClouds(int[] c) {
        int i = 0;
        int count = 0;
        while (i < c.length) {
            if (i == c.length - 2 || i == c.length - 3) {
                if ((i == c.length - 2 && c[i + 1] == 0) || (i == c.length - 3 && c[i + 2] == 0)) {
                    count++;
                }
                break;
            }
            if (c[i + 2] == 0) {
                count++;
                i += 2;
            } else {
                count++;
                i += 1;
            }
        }
        return count;
    }

    public static int equalizeArray(int[] arr) {
        List<Integer> integers = new ArrayList<>();
        for (int a : arr) {
            integers.add(a);
        }
        int most = 0;
        int frequency;
        for (int integer : integers) {
            frequency = 0;
            for (int temp : integers) {
                if (temp == integer) {
                    frequency++;
                }
            }
            if (frequency > most) {
                most = frequency;
            }
        }
        return arr.length - most;
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        if (bc > wc && (wc + z) < bc) {
            return (long) w * (long) wc + ((long) b * ((long) wc + (long) z));
        } else if (wc > bc && (bc + z) < wc) {
            return (long) b * (long) bc + ((long) w * ((long) bc + (long) z));
        } else {
            return (long) b * (long) bc + (long) w * (long) wc;
        }
    }

    public static void kaprekarNumbers(int p, int q) {
        String temp;
        int length;
        int count = 0;
        for (int n = p; n <= q; n++) {
            temp = String.valueOf((long) n * n);
            length = temp.length() - String.valueOf(n).length();
            if (temp.length() > 1 && Integer.valueOf(temp.substring(0, length)) + Integer.valueOf(temp.substring(length)) == n
                    || temp.length() == n) {
                System.out.print(n + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("INVALID RANGE");
        }
    }

    public static int minimumDistances(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    min = Math.abs(i - j) < min ? Math.abs(i - j) : min;
                }
            }
        }
        return min != Integer.MAX_VALUE ? min : -1;
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int result = 0;
        if (s >= p) {
            while (s >= p) {
                if (result == 0) {
                    s -= p;
                } else {
                    p = (p - d <= m) ? m : p - d;
                    s -= p;
                }
                result++;
            }
        }
        return result;
    }

    public static int chocolateFeast(int n, int c, int m) {
        int chocolate = n / c;
        int wrapper = chocolate;
        while (wrapper >= m) {
            wrapper -= m;
            chocolate++;
            wrapper++;
        }
        return chocolate;
    }

    public static int[] serviceLane(int n, int[] w, int[][] cases) {
        int[] results = new int[cases.length];
        int temp;
        for (int i = 0; i < cases.length; i++) {
            temp = Integer.MAX_VALUE;
            for (int j = cases[i][0]; j <= cases[i][1]; j++) {
                temp = w[j] < temp ? w[j] : temp;
            }
            results[i] = temp;
        }
        return results;
    }

    public static int workbook(int n, int k, int[] arr) {
        int result = 0;
        int page = 1;
        for (int number : arr) {
            for (int i = 1; i <= number; i++) {
                if (i == page) {
                    result++;
                }
                if (i % k == 0) {
                    page++;
                }
            }
            if (number % k != 0) {
                page++;
            }
        }
        return result;
    }

    public static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length) {
            return 0;
        }
        List<Integer> stationDistances = new ArrayList<>();
        int min;
        for (int i = 0; i < n; i++) {
            min = Integer.MAX_VALUE;
            for (int station : c) {
                if (Math.abs(i - station) < min) {
                    min = Math.abs(i - station);
                }
            }
            if (min != Integer.MAX_VALUE && min != c[0] - c[c.length - 1]) {
                stationDistances.add(min);
            }
        }
        return Collections.max(stationDistances);
    }
}