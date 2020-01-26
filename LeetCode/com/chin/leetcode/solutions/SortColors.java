package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class SortColors {
    private static void sortColors(@NotNull int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int num : nums) {
            if (num == 0) {
                red++;
            } else if (num == 1) {
                white++;
            } else if (num == 2) {
                blue++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while (red > 0) {
                red--;
                nums[i] = 0;
                i++;
            }
            while (white > 0) {
                white--;
                nums[i] = 1;
                i++;
            }
            while (blue > 0) {
                blue--;
                nums[i] = 2;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {2, 2, 0, 1, 1, 0};
        sortColors(test);
        System.out.println(Arrays.toString(test));
    }
}
