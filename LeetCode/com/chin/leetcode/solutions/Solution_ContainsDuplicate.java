package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_ContainsDuplicate {
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(test1));
        System.out.println(containsDuplicate(test2));
        System.out.println(containsDuplicate(test3));
    }
}
