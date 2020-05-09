package com.test.kata.online;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@SuppressWarnings("squid:S106")
public final class Hackerrank {

    private Hackerrank() {}

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
        return Math.min(countFront, countBack);
    }

    public static int pageCountEx(int n, int p) {
        int front = p / 2;
        int back = (n / 2 - p / 2);
        return Math.min(front, back);
    }

    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double result = mealCost + tip + tax;
        System.out.println((int) Math.round(result));
    }

    public static int countingValleys(String s) {
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

    public static int gemstones(String[] arr) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int gemstones = 0;
        int temp;
        for (char c : alphabet.toCharArray()) {
            temp = 0;
            for (String s : arr) {
                if (s.contains(String.valueOf(c))) {
                    temp++;
                }
            }
            if (arr.length == temp) {
                gemstones++;
            }
        }
        return gemstones;
    }

    public static int beautifulBinaryString(String b) {
        int change = 0;
        char[] chars = b.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (i + 2 <= chars.length - 1 && chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0') {
                change++;
                i += 2;
            } else {
                i++;
            }
        }
        return change;
    }

    public static String caesarCipher(String s, int k) {
        int swap = k % 26;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String lowerCaseCiphered = alphabets.substring(swap).concat(alphabets.substring(0, swap));
        String upperCaseCiphered = lowerCaseCiphered.toUpperCase();
        char[] arr = s.toCharArray();
        int index;
        String alphabet;
        for (int i = 0; i < arr.length; i++) {
            alphabet = String.valueOf(arr[i]);
            if (alphabets.contains(alphabet)) {
                index = alphabets.indexOf(alphabet);
                arr[i] = lowerCaseCiphered.toCharArray()[index];
            } else if (alphabets.contains(alphabet.toLowerCase())) {
                index = alphabets.indexOf(alphabet.toLowerCase());
                arr[i] = upperCaseCiphered.toCharArray()[index];
            }
        }
        return new String(arr);
    }

    public static int theLoveLetterMystery(String s) {
        int changes = 0;
        char[] arr = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                changes += Math.abs(arr[i] - arr[j]);
            }
        }
        return changes;
    }

    public static int anagram(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        } else {
            int changes = 0;
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            char[] s1Chars = s1.toCharArray();
            int index;
            for (char c : s1Chars) {
                index = s2.indexOf(c);
                if (index == -1) {
                    changes++;
                } else {
                    s2 = s2.substring(0, index).concat(s2.substring(index + 1));
                }
            }
            return changes;
        }
    }

    public static int makingAnagrams(String s1, String s2) {
        int changes = Math.abs(s1.length() - s2.length());
        if (s1.length() > s2.length()) {
            return getChanges(changes, s2.toCharArray(), s1);
        } else {
            return getChanges(changes, s1.toCharArray(), s2);
        }
    }

    private static int getChanges(int changes, char[] arr, String s) {
        int index;
        for (char c : arr) {
            index = s.indexOf(c);
            if (index == -1) {
                changes += 2;
            } else {
                s = s.substring(0, index).concat(s.substring(index + 1));
            }
        }
        return changes;
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
            asciiArr[i] = arr[i];
            reverseArr[i] = arr[j];
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
                    if ('1' == firstArr[k] || '1' == secondArr[k]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
                integers.add(count);
            }
        }
        return new int[]{max, Collections.frequency(integers, max)};
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
        char[] sos = {'S', 'O', 'S'};
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
        s = s.toLowerCase().replace(" ", "");
        Set<Character> alphabets = new HashSet<>();
        for (char c : s.toCharArray()) {
            alphabets.add(c);
        }
        return alphabets.size() < 26 ? "not pangram" : "pangram";
    }

    public static String[] weightedUniformStrings(String s, int[] queries) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 21, 22, 23, 24, 25, 26};
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

    public static int introTutorial(int V, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static String appendAndDelete(String s, String t, int k) {
        int indexLast = 0;
        for (int i = 0; i < Math.min(s.length() - 1, t.length() - 1); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                indexLast = i;
                break;
            }
        }
        int count;
        if (indexLast == 0 && s.length() != t.length()) {
            count = Math.abs(s.length() - t.length());
        } else if (indexLast == 0) {
            count = t.length() * 2;
        } else {
            count = (t.length() - indexLast) * 2;
        }
        return s.equals(t) || count <= k && count % 2 == 0 || count <= k && k % 2 != 0 ? "Yes" : "No";
    }

    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] ranks = new int[alice.length];
        Set<Integer> scoreSet = new LinkedHashSet<>();
        for (int n : scores) {
            scoreSet.add(n);
        }
        List<Integer> scoreList = new ArrayList<>(scoreSet);
        Collections.sort(scoreList);
        int index = 0;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] < scoreList.get(0)) {
                ranks[i] = scoreList.size() + 1;
            } else {
                for (int j = index; j < scoreList.size(); j++) {
                    if (alice[i] < scoreList.get(j)) {
                        ranks[i] = scoreList.size() - index + 1;
                        break;
                    }
                    index++;
                }
                if (ranks[i] == 0) {
                    ranks[i] = 1;
                }
            }
        }
        return ranks;
    }

    public static int[] sortNumber(int[] numbers) {
        int i = 1;
        int temp;
        while (i < numbers.length) {
            if (numbers[i - 1] <= numbers[i]) {
                i++;
            } else {
                temp = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = temp;
                i = 1;
            }
        }
        return numbers;
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
            if (String.valueOf(chars[i]).concat(String.valueOf(chars[i + 1])).equals(aString)) {
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
            if (temp.length() > 1
                    && Integer.parseInt(temp.substring(0, length)) + Integer.parseInt(temp.substring(length)) == n
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
                    min = Math.min(Math.abs(i - j), min);
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
                    p = Math.max(p - d, m);
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
                temp = Math.min(w[j], temp);
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

    public static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int temp = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[j] == i + 1) {
                    temp = j + 1;
                    break;
                }
            }
            for (int k = 0; k < p.length; k++) {
                if (p[k] == temp) {
                    result[i] = k + 1;
                    break;
                }
            }
        }
        return result;
    }

    public static int beautifulTriplets(int d, int[] arr) {
        int triplets = 0;
        Set<Integer> integerSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int temp1;
        int temp2;
        for (int value : arr) {
            temp1 = value + d;
            temp2 = temp1 + d;
            if (integerSet.containsAll(Arrays.asList(temp1, temp2))) {
                triplets++;
            }
        }
        return triplets;
    }

    public static String gameOfThrones(String s) {
        List<Character> characterList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Set<Character> characterSet = new HashSet<>(characterList);
        int odd = 0;
        for (char c : characterSet) {
            if (Collections.frequency(characterList, c) % 2 != 0) {
                odd++;
            }
        }
        return odd < 2 ? "YES" : "NO";
    }

    public static int stringConstruction(String s) {
        int price = 0;
        Set<Character> characterSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (characterSet.add(c)) {
                price++;
            }
        }
        return price;
    }

    public static String twoStrings(String s1, String s2) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = false;
        for (char c : alphabet.toCharArray()) {
            if (s1.contains(String.valueOf(c)) && s2.contains(String.valueOf(c))) {
                flag = true;
                break;
            }
        }
        return flag ? "YES" : "NO";
    }

    public static int alternate(String s) {
        if (s.length() <= 2) {
            return s.length();
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        if (1 >= a.length || 0 == d) {
            return a;
        }
        d = d % a.length;
        int[] newArr = new int[a.length];
        int j = 0;
        for (int i = d; i < a.length; i++, j++) {
            newArr[j] = a[i];
        }
        for (int k = 0; j < newArr.length; j++, k++) {
            newArr[j] = a[k];
        }
        return newArr;
    }

    public static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magMap = Arrays.stream(magazine)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String s : note) {
            if (null != magMap.get(s) && magMap.get(s) != 0) {
                magMap.put(s, magMap.get(s) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void minimumBribes(int[] q) {
        int bribeCount = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    bribeCount++;
                }
            }
        }
        System.out.println(bribeCount);
    }

    public static int maximumToys(int[] prices, int k) {
        int toysCount = 0;
        Arrays.sort(prices);
        for (int price : prices) {
            if (price > k) {
                break;
            }
            toysCount++;
            k -= price;
        }
        return toysCount;
    }

    public static int hourglassSum(int[][] arr) {
        int highest = Integer.MIN_VALUE;
        int temp;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0, k = 1; j < arr[i].length - 2; j++, k++) {
                temp = 0;
                temp += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                temp += arr[i + 1][k];
                temp += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temp > highest) {
                    highest = temp;
                }
            }
        }
        return highest;
    }

    public static int minimumSwaps(int[] arr) {
        int swap = 0;
        int temp;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                swap++;
            } else {
                i++;
            }
        }
        return swap;
    }
}
