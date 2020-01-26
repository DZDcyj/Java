package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class MajorityElement {
    private static int majorityElement(@NotNull int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        int[] test3 = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(test1));
        System.out.println(majorityElement(test2));
        System.out.println(majorityElement(test3));
    }
}
