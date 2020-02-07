package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class DungeonGame {
    private static final int STEP = 2;

    private static int calculateMinimumHp(@NotNull int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] hp = new int[m][n];
        hp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);

        for (int i = m - STEP; i >= 0; i--) {
            hp[i][n - 1] = Math.max(1, hp[i + 1][n - 1] - dungeon[i][n - 1]);
        }

        for (int i = n - STEP; i >= 0; i--) {
            hp[m - 1][i] = Math.max(1, hp[m - 1][i + 1] - dungeon[m - 1][i]);
        }
        for (int i = m - STEP; i >= 0; i--) {
            for (int j = n - STEP; j >= 0; j--) {
                int min = Math.min(hp[i + 1][j], hp[i][j + 1]);
                hp[i][j] = Math.max(1, min - dungeon[i][j]);
            }
        }
        return hp[0][0];
    }

    public static void main(String[] args) {
        int[][] testCase = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        System.out.println(calculateMinimumHp(testCase));
    }
}
