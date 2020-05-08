package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class ZeroOneMatrix {
    @NotNull
    private static int[][] updateMatrix(@NotNull int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j] = (matrix[i][j] == 0 ? 0 : Integer.MAX_VALUE);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (i + 1 < matrix.length) {
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                }
                if (j + 1 < matrix[0].length) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        int[][] test1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] test2 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(updateMatrix(test1)));
        System.out.println(Arrays.deepToString(updateMatrix(test2)));
    }
}
