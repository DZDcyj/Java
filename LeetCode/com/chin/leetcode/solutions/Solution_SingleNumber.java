package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_SingleNumber {
    @Contract(pure = true)
    private static int singleNumber(@NotNull int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 2, 1};
        int[] test2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
    }
}
