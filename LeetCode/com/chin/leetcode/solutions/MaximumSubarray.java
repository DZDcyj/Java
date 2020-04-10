package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MaximumSubarray {
    @Contract(pure = true)
    private static int maxSubArray(@NotNull int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        boolean allPositive = false;
        for (int num : nums) {
            if (num > 0) {
                allPositive = true;
                break;
            }
        }
        if (allPositive) {
            int max = 0;
            int curr = 0;
            for (int num : nums) {
                curr += num;
                if (curr < 0) {
                    curr = 0;
                }
                if (curr > max) {
                    max = curr;
                }
            }
            return max;
        } else {
            int max = nums[0];
            for (int num : nums) {
                if (max < num) {
                    max = num;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {-1};
        System.out.println(maxSubArray(test));
        System.out.println(maxSubArray(test2));
    }
}
