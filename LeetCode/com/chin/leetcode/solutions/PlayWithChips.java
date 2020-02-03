package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class PlayWithChips {
    @Contract(pure = true)
    private static int minCostToMoveChips(@NotNull int[] chips) {
        int odd = 0;
        int even = 0;
        for (int chip : chips) {
            if ((chip & 1) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }

    public static void main(String[] args) {
        int[] testCase1 = {1, 2, 3};
        System.out.println(minCostToMoveChips(testCase1));
        int[] testCase2 = {2, 2, 2, 3, 3};
        System.out.println(minCostToMoveChips(testCase2));
    }
}
