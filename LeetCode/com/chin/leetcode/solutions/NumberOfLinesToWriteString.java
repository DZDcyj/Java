package com.chin.leetcode.solutions;

import java.util.Arrays;

/**
 * @author Chin
 */
public class NumberOfLinesToWriteString {
    private static int[] numberOfLines(int[] widths, String s) {
        int currentLength = 0;
        int line = 1;
        for (int i = 0; i < s.length(); i++) {
            currentLength += widths[s.charAt(i) - 'a'];
            if (currentLength > 100) {
                currentLength = widths[s.charAt(i) - 'a'];
                line++;
            } else if (currentLength == 100) {
                currentLength -= 100;
                line++;
            }
        }
        int[] result = new int[2];
        result[0] = line;
        result[1] = currentLength;
        return result;
    }

    public static void main(String[] args) {
        int[] width1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] width2 = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(numberOfLines(width1, "abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(numberOfLines(width2, "bbbcccdddaaa")));
    }
}
