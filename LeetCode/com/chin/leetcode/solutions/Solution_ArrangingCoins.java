package com.chin.leetcode.solutions;

public class Solution_ArrangingCoins {
    private static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    public static void main(String[] args) {
        for (int k = 1; k < 100; k++)
            System.out.println(k + " coins: " + arrangeCoins(k));
        System.out.println(arrangeCoins(Integer.MAX_VALUE));
    }
}
