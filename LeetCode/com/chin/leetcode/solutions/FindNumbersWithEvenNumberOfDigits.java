package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class FindNumbersWithEvenNumberOfDigits {

    private static int getDigit(int num) {
        int plot = 0;
        while (num > 0) {
            plot++;
            num /= 10;
        }
        return plot;
    }

    @Contract(pure = true)
    private static int findNumbers(@NotNull int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((getDigit(num) & 1) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = {12, 345, 2, 6, 7896};
        int[] test2 = {555, 901, 482, 1771};
        System.out.println(findNumbers(test1));
        System.out.println(findNumbers(test2));
    }
}
