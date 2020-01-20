package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_ReshapeTheMatrix {
    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length) {
            return nums;
        }
        int[][] result = new int[r][c];
        int row = 0, line = 0;
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                result[row][line] = num[j];
                line++;
                if (line == c) {
                    line = 0;
                    row++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {3, 4}};
        int[][] nums2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(nums1, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(nums2, 2, 3)));
    }
}
