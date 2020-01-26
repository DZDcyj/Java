package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class RemoveAllAdjacentDuplicatesInString {
    private static String removeDuplicates(@NotNull String s) {
        boolean needCheck;
        do {
            needCheck = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    needCheck = true;
                    s = s.replace(s.substring(i, i + 2), "");
                }
            }
        } while (needCheck);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("abba"));
    }
}
