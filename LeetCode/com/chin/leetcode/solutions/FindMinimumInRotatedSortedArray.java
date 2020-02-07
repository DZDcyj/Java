package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class FindMinimumInRotatedSortedArray {
    @Contract(pure = true)
    private static int findMin(@NotNull int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                min = nums[i + 1];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 4, 5, 1, 2};
        int[] test2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(test1));
        System.out.println(findMin(test2));
    }
}
