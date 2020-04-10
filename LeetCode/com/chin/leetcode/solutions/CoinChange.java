package com.chin.leetcode.solutions;

import java.util.Arrays;

/**
 * @author Chin
 */
public class CoinChange {
    private static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] change = new int[max];
        Arrays.fill(change, max);
        change[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    change[i] = Math.min(change[i], change[i - coin] + 1);
                }
            }
        }
        return change[amount] > amount ? -1 : change[amount];
    }

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        int[] coins2 = {2};
        System.out.println(coinChange(coins1, 11));
        System.out.println(coinChange(coins2, 3));
    }
}
