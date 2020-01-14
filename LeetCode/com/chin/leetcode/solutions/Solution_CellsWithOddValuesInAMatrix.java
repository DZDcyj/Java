package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class Solution_CellsWithOddValuesInAMatrix {
    private static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        for (int[] index : indices) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (j == index[0] || k == index[1]) {
                        matrix[j][k]++;
                        if (j == index[0] && k == index[1]) {
                            matrix[j][k]++;
                        }
                    }
                }
            }
        }
        int count = 0;
        for (int[] ints : matrix) {
            for (int k = 0; k < m; k++) {
                if (ints[k] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] test1 = {{0, 1}, {1, 1}};
        int[][] test2 = {{1, 1}, {0, 0}};
        System.out.println(oddCells(2, 3, test1));
        System.out.println(oddCells(2, 2, test2));
    }

}
