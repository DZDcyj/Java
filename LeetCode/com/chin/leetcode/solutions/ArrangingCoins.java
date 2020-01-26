package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class ArrangingCoins {
    private static final int MAX_VALUE = 100;

    private static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    public static void main(String[] args) {
        for (int k = 1; k < MAX_VALUE; k++) {
            System.out.println(k + " coins: " + arrangeCoins(k));
        }
        System.out.println(arrangeCoins(Integer.MAX_VALUE));
    }
}
