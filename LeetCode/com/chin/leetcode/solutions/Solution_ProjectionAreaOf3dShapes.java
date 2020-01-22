package com.chin.leetcode.solutions;

public class Solution_ProjectionAreaOf3dShapes {
    private static int projectionArea(int[][] grid) {
        int square = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                square += (grid[i][j] != 0 ? 1 : 0);
            }
        }
        for (int[] ints : grid) {
            int max = Integer.MIN_VALUE;
            for (int anInt : ints) {
                max = Math.max(max, anInt);
            }
            square += max;
        }
        for (int j = 0; j < grid[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int[] ints : grid) {
                max = Math.max(max, ints[j]);
            }
            square += max;
        }

        return square;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{2}};
        int[][] grid2 = {{1, 2}, {3, 4}};
        int[][] grid3 = {{1, 0}, {0, 2}};
        int[][] grid4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] grid5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(projectionArea(grid1));
        System.out.println(projectionArea(grid2));
        System.out.println(projectionArea(grid3));
        System.out.println(projectionArea(grid4));
        System.out.println(projectionArea(grid5));
    }
}
