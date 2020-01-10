package com.chin.leetcode.solutions;

public class Solution_UniquePaths {
    private static int uniquePaths(int m, int n) {
        if (m <= 1 || n <= 1) {
            return 1;
        }
        int[][] graph = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    graph[i][j] = 1;
                } else {
                    graph[i][j] = graph[i - 1][j] + graph[i][j - 1];
                }
            }
        }
        return graph[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
        System.out.println(uniquePaths(7, 3));
    }
}
