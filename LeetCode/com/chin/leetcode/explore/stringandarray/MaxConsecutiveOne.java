package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MaxConsecutiveOne {
    private static int findMaxConsecutiveOnes(@NotNull int[] nums) {
        int length = 0, maxLength = 0;
        for (int num : nums) {
            if (num == 0) {
                maxLength = Math.max(length, maxLength);
                length = 0;
            } else {
                length++;
            }
        }
        maxLength = Math.max(length, maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        int[] test = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(test));
    }
}
