package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class FindTheDifference {
    private static char findTheDifference(@NotNull String s, @NotNull String t) {
        String str = s + t;
        char a = 0;
        for (int i = 0; i < str.length(); i++) {
            a ^= str.charAt(i);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("abc", "ascb"));
    }
}
