package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(@NotNull int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                nums[result] = max;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 2};
        int[] test2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(test1));
        for (int i : test1) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(removeDuplicates(test2));
        for (int i : test2) {
            System.out.print(i);
        }
    }
}
