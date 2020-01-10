package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Solution_TrappingRainWater {
    /**
     * This func Time Limit Exceed
     */
    private static int trap(@NotNull int[] height) {
        int volume = 0;
        int min = 0;
        int max = 0;
        for (int n : height) {
            min = Math.min(n, min);
        }
        for (int i = 0; i < height.length; i++) {
            height[i] -= min;
        }
        for (int n : height) {
            max = Math.max(n, max);
        }
        for (int i = 0; i < max; i++) {
            int p1 = 0, p2 = 0;
            boolean first = true;
            for (int j = 0; j < height.length; j++) {
                if (height[j] > 0) {
                    if (first) {
                        first = false;
                        p1 = p2 = j;
                    } else {
                        if (p1 <= p2) {
                            p1 = j;
                            volume += (p1 - p2 - 1);
                        } else {
                            p2 = j;
                            volume += (p2 - p1 - 1);
                        }
                    }
                    height[j]--;
                }
            }
        }
        return volume;
    }

    private static int fasterTrap(@NotNull int[] height) {
        int left = 0, right = height.length - 1;
        int volume = 0;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    volume += (leftMax - height[left]);
                }
                ++left;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    volume += (rightMax - height[right]);
                }
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] test = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1, 5, 6, 7, 3, 4, 2, 1, 0};
        System.out.println(trap(height));
        System.out.println(trap(test));
    }
}
