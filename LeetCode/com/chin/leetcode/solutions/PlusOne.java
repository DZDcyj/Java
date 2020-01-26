package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class PlusOne {
    private static final int TEN = 10;

    @NotNull
    private static int[] plusOne(@NotNull int[] digits) {
        boolean allNine = true;
        for (int digit : digits) {
            if (digit != 9) {
                allNine = false;
                break;
            }
        }
        if (allNine) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            while (digits[i] >= TEN) {
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 3, 2, 1};
        int[] test3 = {9, 9};
        System.out.println(Arrays.toString(plusOne(test1)));
        System.out.println(Arrays.toString(plusOne(test2)));
        System.out.println(Arrays.toString(plusOne(test3)));
    }
}
