package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class DetectCapital {
    private static final int LENGTH_OF_TWO_LETTERS = 2;

    private static boolean detectCapitalUse(@NotNull String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.length() == LENGTH_OF_TWO_LETTERS) {
            if (Character.isLowerCase(word.charAt(0))) {
                return Character.isLowerCase(word.charAt(1));
            }
        }
        if (Character.isUpperCase(word.charAt(0))) {
            boolean secondCapital = (Character.isUpperCase(word.charAt(1)));
            if (secondCapital) {
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            }

        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
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
