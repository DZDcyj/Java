package com.chin.leetcode.solutions;

public class Solution_RemoveAllAdjacentDuplicatesInString {
    private static String removeDuplicates(String S) {
        boolean needCheck;
        do {
            needCheck = false;
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    needCheck = true;
                    S = S.replace(S.substring(i, i + 2), "");
                }
            }
        } while (needCheck);
        return S;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("abba"));
    }
}
