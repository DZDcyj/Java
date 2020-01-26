package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class SingleNumberTwo {
    @Contract(pure = true)
    private static int singleNumber(@NotNull int[] nums) {
        int k1 = 0, k2 = 0, mask;
        for (int num : nums) {
            k2 ^= k1 & num;
            k1 ^= num;
            mask = ~(k1 & k2);
            k2 &= mask;
            k1 &= mask;
        }
        return k1;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 2, 3, 2};
        int[] test2 = {0, 1, 0, 1, 0, 1, 99};
        int[] test3 = {1};
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
        System.out.println(singleNumber(test3));
    }
}
