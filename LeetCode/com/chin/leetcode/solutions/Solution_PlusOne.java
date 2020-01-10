package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_PlusOne {
    private static int[] plusOne(int[] digits) {
        boolean allNine = true;
        for (int digit : digits) {
            if (digit != 9) {
                allNine = false;
                break;
            }
        }
        if (allNine) {
            int[] newdigits = new int[digits.length + 1];
            newdigits[0] = 1;
            return newdigits;
        }
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            while (digits[i] >= 10) {
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
