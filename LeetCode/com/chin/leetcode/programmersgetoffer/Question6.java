package com.chin.leetcode.programmersgetoffer;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class Question6 {

    /**
     * This function returns a compressed string of given string
     * If the compressed one is longer, return the origin
     *
     * @param s String to compress
     * @return The compressed string
     * <p>
     * Sample input:
     * 1. aabcccccaaa
     * 2. abbccd
     * <p>
     * Sample output:
     * 1. a2b1c5a3
     * 2. abbccd(a1b2c2d1 is longer than abbccd)
     */
    public String compressString(String s) {
        if (s == null || s.length() <= 2) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder().append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                stringBuilder.append(count).append(s.charAt(i));
                count = 1;
            }
        }
        return stringBuilder.append(count).length() < s.length() ? stringBuilder.toString() : s;
    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        System.out.println(question6.compressString("aabcccccaaa"));
        System.out.println(question6.compressString("abbccd"));
    }
}