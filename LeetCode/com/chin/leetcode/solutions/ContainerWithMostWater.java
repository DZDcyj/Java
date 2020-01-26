package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ContainerWithMostWater {
    private static int maxArea(@NotNull int[] height) {
        int lo = 0;
        int hi = height.length - 1;
        int volume = Math.min(height[lo], height[hi]) * (hi - lo);
        while (lo < hi) {
            volume = Math.max(volume, Math.min(height[lo], height[hi]) * (hi - lo));
            if (height[lo] < height[hi]) {
                lo++;
            } else {
                hi--;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 10, 5, 7, 8, 9};
        System.out.println(maxArea(test));
    }
}
