package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_IsSubsequence {
    private static boolean isSubsequence(@NotNull String s, String t) {
        if (s.length() == 0)
            return true;
        int index = 0;
        char letter = s.charAt(index);
        for (int i = 0; i < t.length(); i++) {
            if (letter == t.charAt(i)) {
                index++;
                if (index == s.length())
                    return true;
                letter = s.charAt(index);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("ace", "abcde"));
    }
}
