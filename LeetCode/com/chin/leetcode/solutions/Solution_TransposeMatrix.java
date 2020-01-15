package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_TransposeMatrix {
    private static int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[j][i] = A[i][j];
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
