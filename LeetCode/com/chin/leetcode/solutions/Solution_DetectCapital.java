package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_DetectCapital {
    private static boolean detectCapitalUse(@NotNull String word) {
        if (word.length() <= 1)
            return true;
        else if (word.length() == 2) {
            if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z')
                return word.charAt(1) >= 'a' && word.charAt(1) <= 'z';
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            boolean secondCapital = (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z');
            if (secondCapital) {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                        return false;
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                        return false;
                }
            }

        } else {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("jetBrains"));
        System.out.println(detectCapitalUse("mL"));
    }
}
