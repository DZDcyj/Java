package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_GuessNumberHigherOrLower {
    private int number;

    @Contract(pure = true)
    private Solution_GuessNumberHigherOrLower(int number) {
        this.number = number;
    }

    @Contract(pure = true)
    private int guess(int num) {
        if (num < number)
            return 1;
        else if (num == number)
            return 0;
        return -1;
    }

    @Contract(pure = true)
    private int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_GuessNumberHigherOrLower solution_guessNumberHigherOrLower = new Solution_GuessNumberHigherOrLower(6);
        System.out.println(solution_guessNumberHigherOrLower.guessNumber(10));
    }
}
