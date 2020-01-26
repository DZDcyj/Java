package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class TwoSum {
    @NotNull
    @Contract(pure = true)
    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        int indexOfX = 0, indexOfY = 0;

        outer:for (int x : nums) {
            for (int y : nums) {
                if (indexOfY != indexOfX && (x + y) == target) {
                    break outer;
                }
                indexOfY++;
            }
            indexOfY = 0;
            indexOfX++;
        }
        results[0] = indexOfX;
        results[1] = indexOfY;
        return results;
    }
}
