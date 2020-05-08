package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MinSubArrayLen {
    @Contract(pure = true)
    private static int minSubArrayLen(int s, int @NotNull [] nums) {
        int len = nums.length;
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            while (sum >= s) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(2, nums));
        int[] tle1 = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, tle1));
        int[] tle2 = {1, 2, 3, 4, 5};
        System.out.println(minSubArrayLen(11, tle2));
    }
}
