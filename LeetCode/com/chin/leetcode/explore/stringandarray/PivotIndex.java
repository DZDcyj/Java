package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class PivotIndex {
    @Contract(pure = true)
    private static int pivotIndex(@NotNull int[] nums) {
        int leftSum = 0, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 7, 3, 6, 5, 6};
        int[] test2 = {1, 2, 3};
        int[] err1 = {-1, -1, -1, -1, -1, 0};
        System.out.println(pivotIndex(test1));
        System.out.println(pivotIndex(test2));
        System.out.println(pivotIndex(err1));
    }
}
