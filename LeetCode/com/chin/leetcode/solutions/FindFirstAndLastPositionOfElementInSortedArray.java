package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    private static int[] searchRange(@NotNull int[] nums, int target) {
        int[] result = {-1, -1};
        int left = getIndex(nums, target, true);

        if (left == nums.length || nums[left] != target) {
            return result;
        }
        result[0] = left;
        result[1] = getIndex(nums, target, false) - 1;
        return result;
    }

    @Contract(pure = true)
    private static int getIndex(@NotNull int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid;
            }
            if (left && target == nums[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] testCase = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(testCase, 8)));
        System.out.println(Arrays.toString(searchRange(testCase, 6)));

        int[] error1 = {2, 2};
        System.out.println(Arrays.toString(searchRange(error1, 0)));
    }
}
