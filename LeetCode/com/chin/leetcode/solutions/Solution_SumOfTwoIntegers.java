package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_SumOfTwoIntegers {
    @Contract(pure = true)
    // TODO: try not using + / -
    private static int getSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(-2, 3));
    }
}
