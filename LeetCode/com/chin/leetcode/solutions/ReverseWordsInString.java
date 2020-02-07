package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class ReverseWordsInString {
    private static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                stringBuilder.append(words[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world!"));
        System.out.println(reverseWords("a good   example"));
    }
}
