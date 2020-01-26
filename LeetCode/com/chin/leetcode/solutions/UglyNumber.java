package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;


/**
 * @author Chin
 */
public class UglyNumber {
    private static final int[] TEST_NUMBERS = {2, 3, 5};

    @Contract(pure = true)
    private static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int i = 0;
        while (num % TEST_NUMBERS[i] == 0) {
            num /= 2;
        }
        i++;
        while (num % TEST_NUMBERS[i] == 0) {
            num /= 3;
        }
        i++;
        while (num % TEST_NUMBERS[i] == 0) {
            num /= 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(8));
        System.out.println(isUgly(14));
    }
}
