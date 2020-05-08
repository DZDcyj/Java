package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;

/**
 * @author Chin
 */
public class Question56One {

    /**
     * @param nums The given array
     * @return An array with two numbers which appear only once
     * <p>
     * Sample input:
     * 1. [4, 1, 4, 6]
     * 2. [1, 2, 10, 4, 1, 4, 3, 3]
     *
     * Sample output:
     * 1. [1, 6] or [6, 1]
     * 2. [2, 10] or [10, 2]
     */
    public int[] singleNumbers(int @NotNull [] nums) {
        if (nums.length == 2) {
            return nums;
        }
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int div = 1;
        while ((div & res) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((div & num) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    @TestOnly
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 4, 6};
        int[] nums2 = {1, 2, 10, 4, 1, 4, 3, 3};
        Question56One question56One = new Question56One();
        System.out.println(Arrays.toString(question56One.singleNumbers(nums1)));
        System.out.println(Arrays.toString(question56One.singleNumbers(nums2)));
    }
}
