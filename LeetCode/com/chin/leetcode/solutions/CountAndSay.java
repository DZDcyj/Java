package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class CountAndSay {
    private static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = getNewString(result);
        }
        return result;
    }

    @NotNull
    private static String getNewString(@NotNull String prev) {
        if (prev.length() == 0) {
            return "";
        } else if (prev.length() == 1) {
            return "1" + prev;
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        int start = 0;
        char curr = prev.charAt(0);
        while (index < prev.length()) {
            if (prev.charAt(index) != curr) {
                result.append(index - start).append(curr);
                curr = prev.charAt(index);
                start = index;
            }
            index++;
        }
        result.append(index - start).append(curr);
        return result.toString();
    }

    public static void main(String[] args) {
        int testSize = 10;
        for (int i = 1; i <= testSize; i++) {
            System.out.println(countAndSay(i));
        }
    }
}
