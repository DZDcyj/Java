package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class Pow {
    private static final int EVEN = 2;

    @Contract(pure = true)
    private static double myPow(double x, int n) {
        long n1 = n;
        if (n1 < 0) {
            x = 1 / x;
            n1 = -n1;
        }
        double ans = 1;
        double currentProduct = x;
        for (long i = n1; i > 0; i /= EVEN) {
            if ((i % 2) == 1) {
                ans = ans * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }
}
