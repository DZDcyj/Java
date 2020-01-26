package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class TransposeMatrix {
    @NotNull
    private static int[][] transpose(@NotNull int[][] a) {
        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] input2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose(input1)));
        System.out.println(Arrays.deepToString(transpose(input2)));
    }
}
