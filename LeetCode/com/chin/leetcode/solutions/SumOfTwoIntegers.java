package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class SumOfTwoIntegers {
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
