package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class NumberComplement {
    private static int findComplement(int num) {
        int temp = num;
        int mask = 1;
        while (temp > 0) {
            mask <<= 1;
            temp >>= 1;
        }
        mask -= 1;
        return mask ^ num;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }
}
