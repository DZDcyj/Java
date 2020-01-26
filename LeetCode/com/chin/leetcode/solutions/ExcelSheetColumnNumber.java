package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ExcelSheetColumnNumber {
    @Contract(pure = true)
    private static int titleToNumber(@NotNull String s) {
        int index = 1;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (s.charAt(i) - '@') * index;
            index *= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }
}
