package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class DivideTwoIntegers {
    // First, I used ++, the runtime is 1346ms, too SLOW!!!!

    /**
     * @author LucaZhao
     * @date 2019/10/10
     */

    @Contract(pure = true)
    private static int divide(int dividend, int divisor) {
        boolean flag = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        // Here we solve the symbol, change both numbers to negative

        while (dividend <= divisor) {
            int tempResult = -1;
            int tempDivisor = divisor;
            while (dividend <= (tempDivisor << 1)) {
                if (tempDivisor <= (Integer.MIN_VALUE >> 1)) {
                    break;
                }
                tempResult = tempResult << 1;
                tempDivisor = tempDivisor << 1;
                // Here we double the tempDivisor, accelerate the progress
            }
            dividend = dividend - tempDivisor;
            result += tempResult;
            // Here we got the result
        }
        if (!flag) {
            if (result <= Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(Integer.MIN_VALUE, -1));
        System.out.println(divide(2, 2));
        System.out.println(divide(Integer.MIN_VALUE, 2));
    }
}
