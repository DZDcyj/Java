package com.chin.leetcode.solutions;

public class Solution_ToeplitzMatrix {
    private static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        int[][] matrix2 = {{1, 2}, {2, 2}};
        System.out.println(isToeplitzMatrix(matrix1));
        System.out.println(isToeplitzMatrix(matrix2));
    }
}
