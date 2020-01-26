package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 * */
public class BinarySearch {
    @Contract(pure = true)
    private static int search(@NotNull int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testCase1 = {-1, 0, 3, 5, 9, 12};
        int[] testCase2 = {-1, 0, 3, 5, 9, 12};
        int[] testCase3 = {1, 2, 3, 4, 5, 6, 7};
        int[] testCase4 = {5};
        System.out.println(search(testCase1, 9));
        System.out.println(search(testCase2, 2));
        System.out.println(search(testCase3, 3));
        System.out.println(search(testCase3, 8));
        System.out.println(search(testCase4, 5));
    }
}
