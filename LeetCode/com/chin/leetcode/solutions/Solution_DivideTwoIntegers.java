package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_DivideTwoIntegers {
    // First, I used ++, the runtime is 1346ms, too SLOW!!!!
    /**
     * @author LucaZhao
     * @date 2019/10/10
     *
     * */

    @Contract(pure = true)
    private static int divide(int dividend, int divisor) {
        boolean flag = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        if (dividend > 0)
            dividend = -dividend;
        if (divisor > 0)
            divisor = -divisor;        // Here we solve the symbol, change both numbers to negative

        while (dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            while (dividend <= (temp_divisor << 1)) {
                if (temp_divisor <= (Integer.MIN_VALUE >> 1))
                    break;
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;           // Here we double the temp_divisor, accelerate the progress
            }
            dividend = dividend - temp_divisor;
            result += temp_result;                          // Here we got the result
        }
        if (!flag) {
            if (result <= Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
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
