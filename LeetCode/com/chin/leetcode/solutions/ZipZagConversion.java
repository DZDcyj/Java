package com.chin.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class ZipZagConversion {
    /**
     * @param s       The origin String
     * @param numRows The number of Rows transformed
     * @return The Transformed String
     * <p>
     * How does this function work?
     * First, if numRows equals 1, we just return the origin String
     * Otherwise, we start to deal with the String s
     * We uses a list to storage every row's String
     * Then we add every letter to every String
     * In the end, we add every String and return the result
     * @author LeetCode
     * @date 2019/10/9
     */
    private static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) {
            ret.append(row);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        final String testString = "LEETCODEISHIRING";
        System.out.println(convert(testString, 3));
        System.out.println(convert(testString, 4));
        System.out.println(convert("TEST", 1));
        System.out.println(convert("TEST", 2));
        System.out.println(convert("A", 2));
    }
}
