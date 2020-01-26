package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class NonDecreasingArray {
    @Contract(pure = true)
    private static boolean checkPossibility(@NotNull int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0 || nums[i + 1] >= nums[i - 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 2, 3};
        int[] test2 = {3, 4, 2, 3};
        System.out.println(checkPossibility(test1));
        System.out.println(checkPossibility(test2));
    }
}
