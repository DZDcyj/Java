package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class NthTribonacciNumber {
    private static final int BEGIN_VALUE = 2;

    private static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= BEGIN_VALUE) {
            return 1;
        }
        int[] results = new int[n + 1];
        results[0] = 0;
        results[1] = 1;
        results[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            results[i] = results[i - 1] + results[i - 2] + results[i - 3];
        }
        return results[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }
}
