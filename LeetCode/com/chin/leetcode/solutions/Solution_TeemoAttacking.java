package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_TeemoAttacking {
    @Contract(pure = true)
    private static int findPoisonedDuration(@NotNull int[] timeSeries, int duration) {
        if (timeSeries.length == 0)
            return 0;
        int time = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            time += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        time += duration;
        return time;
    }

    public static void main(String[] args) {
        int[] time1 = {1, 4};
        int[] time2 = {1, 2};
        System.out.println(findPoisonedDuration(time1, 2));
        System.out.println(findPoisonedDuration(time2, 2));
    }
}
