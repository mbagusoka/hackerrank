package com.test.kata;

@SuppressWarnings("squid:S106")
public class App {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(5));
        System.out.println(sum(new int[] {1, 3, 4}));
    }

    public static int factorial(int num) {
        if (num < 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int fibonacci(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static int sum(int[] nums) {
        return sum(nums, 0);
    }

    public static int sum(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        } else {
            return nums[index] + sum(nums, index + 1);
        }
    }
}