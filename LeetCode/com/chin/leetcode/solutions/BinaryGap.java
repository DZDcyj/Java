package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class BinaryGap {
    private static int binaryGap(int N) {
        int index = -1;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) > 0) {
                if (index >= 0) {
                    result = Math.max(result, i - index);
                }
                index = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(0b1010010001));
    }
}
