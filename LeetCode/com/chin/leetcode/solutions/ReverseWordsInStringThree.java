package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ReverseWordsInStringThree {
    @NotNull
    private static String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        return stringBuilder.reverse().toString();
    }

    @NotNull
    private static String reverseWords(@NotNull String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            stringBuilder.append(reverseWord(word));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Hello World!"));
    }
}
