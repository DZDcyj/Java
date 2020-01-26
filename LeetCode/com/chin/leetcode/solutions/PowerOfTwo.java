package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class PowerOfTwo {

    /**
     * @author Krahets
     * @date 2019/10/22
     * How does this function work?
     * If n > 0
     * If a number is power of two, it must be 10000....0, the number - 1 is 0111....1, we just need to and this two numbers
     */


    private static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(218));
        System.out.println(isPowerOfTwo(1024));
    }
}
