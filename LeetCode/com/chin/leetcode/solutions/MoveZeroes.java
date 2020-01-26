package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class MoveZeroes {
    private static void moveZeroes(@NotNull int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] test = {0, 1, 0, 3, 12, 13, 0, 0, 3};
        System.out.println(Arrays.toString(test));
        moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}
