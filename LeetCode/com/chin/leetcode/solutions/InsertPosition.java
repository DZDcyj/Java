package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class InsertPosition {
    @Contract(pure = true)
    private static int searchInsert(@NotNull int[] nums, int target) {
        // TODO: find O(logN) ways
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3, 5, 6};
        int[] test2 = {5, 2, 7, 0};
        for (int a : test2) {
            System.out.println(searchInsert(test1, a));
        }
        int[] a = {3, 5, 7, 9, 10};
        System.out.println(searchInsert(a, 8));
    }
}
