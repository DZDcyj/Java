package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    private static final int[] PRIMES = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};

    private static int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int t = Integer.bitCount(i);
            result += PRIMES[t];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
        System.out.println(countPrimeSetBits(10, 15));
    }
}
