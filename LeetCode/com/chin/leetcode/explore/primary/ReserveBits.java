package com.chin.leetcode.explore.primary;

/**
 * @author Chin
 */
public class ReserveBits {
    private static int reverseBits(int i) {
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        return (i << 24) |
                ((i & 0xff00) << 8) |
                ((i >>> 8) & 0xff00) |
                (i >>> 24);
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(0b00000010100101000001111010011100));
        System.out.println(reverseBits(0b11111111111111111111111111111101));
        System.out.println(Integer.reverse(-3));
    }
}
