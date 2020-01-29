package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class HeightChecker {
    private static int heightChecker(@NotNull int[] heights) {
        int count = 0;
        int[] copy = new int[heights.length];
        System.arraycopy(heights, 0, copy, 0, copy.length);
        Arrays.sort(copy);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
}
