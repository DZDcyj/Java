package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_MinimumMovesToEqualArrayElements {
    @Contract(pure = true)
    private static int minMoves(@NotNull int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
        }
        for (int num : nums) {
            moves += num - min;
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test2 = {1, 1, 2147483647};
        System.out.println(minMoves(test));
        System.out.println(minMoves(test2));
    }
}
