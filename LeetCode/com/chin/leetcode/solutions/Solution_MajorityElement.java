package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_MajorityElement {
    private static int majorityElement(@NotNull int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private static int majorityElement(int[] nums, boolean use) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;

    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        int[] test3 = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(test1));
        System.out.println(majorityElement(test2));
        System.out.println(majorityElement(test3, true));
    }
}
