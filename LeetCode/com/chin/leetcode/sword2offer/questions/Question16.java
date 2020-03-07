package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question16 {

    /**
     * This function returns the n times of x
     *
     * @param x The base
     * @param n The time
     * @return x^n
     */
    public double myPow(double x, int n) {
        long n1 = n;
        if (n1 < 0) {
            x = 1 / x;
            n1 = -n1;
        }
        double ans = 1;
        double currentProduct = x;
        for (long i = n1; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
        }
        return ans;
    }

    @TestOnly
    public static void main(String[] args) {
        Question16 question16 = new Question16();
        System.out.println(question16.myPow(2.00000, 10));
        System.out.println(question16.myPow(2.10000, 3));
        System.out.println(question16.myPow(2.00000, -2));
    }
}
