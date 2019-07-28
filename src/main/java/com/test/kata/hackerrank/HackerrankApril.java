package com.test.kata.hackerrank;

import java.math.BigInteger;
import java.util.*;

@SuppressWarnings("squid:S106")
public final class HackerrankApril {

    private HackerrankApril() {
        throw new IllegalAccessError("Util Class");
    }

    private static void permutation(String prefix, String s) {
        int n = s.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
            }
        }
    }

    public static int diagonalDiff(int[][] arr) {
        int n = arr[0].length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum1 += arr[i][i];
            sum2 += arr[i][j];
        }
        return Math.abs((sum1 - sum2));
    }

    public static void staircase(int n) {
        StringBuilder space = new StringBuilder();
        StringBuilder sumSharp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            space.append(" ");
        }
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            System.out.println(space.substring(0, j).concat(sumSharp.append("#").toString()));
        }
    }

    public static void miniMaxSum(int[] arr) {
        int n = arr.length;
        BigInteger sum1 = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            sum1 = sum1.add(BigInteger.valueOf(arr[i]));
        }
        for (int i = 1; i < n; i++) {
            sum2 = sum2.add(BigInteger.valueOf(arr[i]));
        }
        System.out.println(sum1 + " " + sum2);
    }

    public static int birthdayCakeCandles(int[] arr) {
        int max = 0;
        int count = 0;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        for (int a : arr) {
            if (a == max) {
                count++;
            }
        }
        return count;
    }

    public static String timeConversion(String s) {
        String result;
        int hour = Integer.parseInt(s.substring(0, 2));
        int hourPM = Integer.parseInt(s.substring(0, 2)) + 12;
        if (s.contains("P")) {
            if (hour == 12) {
                result = s.substring(0, 8);
            } else if (hourPM > 23) {
                result = "00".concat(s.substring(2, 8));
            } else {
                result = String.valueOf(hourPM).concat(s.substring(2, 8));
            }
        } else {
            if (hour < 12) {
                result = s.substring(0, 8);
            } else {
                result = "00".concat(s.substring(2, 8));
            }
        }
        return result;
    }

    public static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = grades[i] < 38 || grades[i] % 5 < 3 ? grades[i] : grades[i] / 5 * 5 + 5;
        }
        return grades;
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apple = 0;
        int orange = 0;
        for (int ap : apples) {
            if ((ap + a) >= s && (ap + a) <= t) {
                apple++;
            }
        }
        for (int or : oranges) {
            if ((or + b) >= s && (or + b) <= t) {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 >= v1) {
            return "NO";
        } else if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static int[] breakingRecords(int[] scores) {
        int highest = scores[0];
        int lowest = scores[0];
        int highCount = 0;
        int lowCount = 0;
        for (int score : scores) {
            if (score > highest) {
                highest = score;
                highCount++;
            }
            if (score < lowest) {
                lowest = score;
                lowCount++;
            }
        }
        return new int[]{highCount, lowCount};
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int a = 0;
        int value = 0;
        for (int i = 0; i < (s.size()); i++) {
            while (a < m) {
                if (i + a >= s.size()) {
                    break;
                }
                value += s.get(i + a);
                a++;
            }
            if (value == d) {
                count++;
            }
            value = 0;
            a = 0;
        }
        return count;
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }
        System.out.println(b == sum / 2 ? "Bon Appetit" : b - sum / 2);
    }

    public static int pageCount(int n, int p) {
        int[][] pages = new int[n / 2 + 1][2];
        int countFront = 0;
        int countBack = 0;
        for (int i = 0; i < n / 2 + 1; i++) {
            pages[i][0] = i + i;
            pages[i][1] = i + i + 1;
        }
        for (int i = 0; i < pages.length - 1; i++) {
            if (pages[i][0] == p || pages[i][1] == p) {
                break;
            }
            countFront++;
        }
        for (int i = pages.length - 1; i >= 0; i--) {
            if (pages[i][0] == p || pages[i][1] == p) {
                break;
            }
            countBack++;
        }
        return countFront > countBack ? countBack : countFront;
    }

    public static int pageCountEx(int n, int p) {
        int ans = 0;
        int front = p / 2;
        int back = (n / 2 - p / 2);
        if (front < back) {
            ans = front;
        } else {
            ans = back;
        }
        return ans;
    }

    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double result = mealCost + tip + tax;
        System.out.println((int) Math.round(result));
    }

    public static int countingValleys(int n, String s) {
        int valley = 0;
        int hike = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') {
                hike += 1;
            } else {
                hike -= 1;
            }
            if (hike == 0 && c == 'U') {
                valley++;
            }
        }
        return valley;
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (max < keyboard + drive && keyboard + drive <= b) {
                    max = keyboard + drive;
                }
            }
        }
        return max;
    }

    public static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) {
            return "Cat A";
        } else if (Math.abs(y - z) < Math.abs(x - z)) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        Set<Integer> set = new TreeSet<>(a);
        for (int integer : set) {

        }
        return 0;
    }

    public static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        return height[height.length - 1] > k ? height[height.length - 1] - k : 0;
    }

    public static int designerPdfViewer(int[] h, String word) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int temp;
        for (int i = 0; i < h.length; i++) {
            map.put(alphabets.toCharArray()[i], h[i]);
        }
        for (char c : word.toCharArray()) {
            temp = map.get(c);
            if (temp > max) {
                max = temp;
            }
        }
        return max * word.toCharArray().length;
    }

    public static int utopianTree(int n) {
        int height = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                height++;
            } else {
                height *= 2;
            }
        }
        return height;
    }

    public static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int n : a) {
            if (n <= 0) {
                count++;
            }
        }
        return count >= k ? "NO" : "YES";
    }

    public static int countSalary(int salary, int years, int percentage) {
        int result = salary;
        for (int i = 0; i < years; i++) {
            result += result * percentage / 100;
        }
        return result;
    }

    public static int beautifulDays(int i, int j, int k) {
        int days = 0;
        int reverse;
        for (int x = i; x <= j; x++) {
            reverse = Integer.parseInt(new StringBuilder(x + "").reverse().toString());
            if (Math.abs(x - reverse) % k == 0) {
                days++;
            }
        }
        return days;
    }
}
