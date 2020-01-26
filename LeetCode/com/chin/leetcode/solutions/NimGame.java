package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class NimGame {
    @Contract(pure = true)
    private static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        int testTimes = 10;
        for (int i = 1; i <= testTimes; i++) {
            System.out.println(canWinNim(i));
        }
    }
}
