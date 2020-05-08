package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class JumpGame {
    @Contract(pure = true)
    private static boolean canJump(int @NotNull [] nums) {
        int n = nums.length;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (i <= right) {
                right = Math.max(right, i + nums[i]);
                if (right >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, 1, 4};
        int[] test2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(test1));
        System.out.println(canJump(test2));
    }
}
