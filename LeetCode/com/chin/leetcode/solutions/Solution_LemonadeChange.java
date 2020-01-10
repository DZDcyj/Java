package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_LemonadeChange {
    @Contract(pure = true)
    private static boolean lemonadeChange(@NotNull int[] bills) {
        int[] changes = new int[3];
        // changes[0] for $5, 1 for $10, 2 for $20
        for (int bill : bills) {
            if (bill == 5) {
                changes[0]++;
            } else if (bill == 10) {
                changes[1]++;
                if (changes[0] == 0) {
                    return false;
                } else {
                    changes[0]--;
                }
            } else if (bill == 20) {
                changes[2]++;
                if (changes[0] == 0) {
                    return false;
                } else if (changes[1] == 0) {
                    if (changes[0] >= 3)
                        changes[0] -= 3;
                    else
                        return false;
                } else if (changes[1] > 0) {
                    changes[1]--;
                    changes[0]--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bill1 = {5, 5, 5, 10, 20};
        int[] bill2 = {5, 5, 10};
        int[] bill3 = {10, 10};
        int[] bill4 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bill1));
        System.out.println(lemonadeChange(bill2));
        System.out.println(lemonadeChange(bill3));
        System.out.println(lemonadeChange(bill4));
    }
}
