package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ExcelSheetColumnTitle {
    @NotNull
    private static String convertToTitle(int n) {
        String letters = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = letters.toCharArray();
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                result.append('Z');
                n = n / 26 - 1;
            } else {
                result.append(chars[n % 26]);
                n = n / 26;
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(702));
    }
}
