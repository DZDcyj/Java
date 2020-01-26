package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class FactorialTrailingZero {
    @Contract(pure = true)
    private static int trailingZeroes(int n) {
        int res = 0;
        long floor = 5;
        while (n / floor > 0) {
            res += n / floor;
            floor *= 5;
        }
        return res;
    }

    @Contract(pure = true)
    private static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(15));
        System.out.println(trailingZeroes(15));
        System.out.println(getFactorial(1));
        System.out.println(trailingZeroes(1));
    }
}
