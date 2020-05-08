package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Chin
 */
public class DominantIndex {
    @Contract(pure = true)
    private static int dominantIndex(@NotNull int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 6, 1, 0};
        int[] test2 = {1, 2, 3, 4};
        int[] err1 = {1, 0};
        System.out.println(dominantIndex(test1));
        System.out.println(dominantIndex(test2));
        System.out.println(dominantIndex(err1));
    }
}
