package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 * */
public class BuddyStrings {
    private static boolean buddyStrings(@NotNull String a, @NotNull String b) {
        if (a.length() != b.length())
            return false;
        if (a.equals(b)) {
            int[] letters = new int[26];
            for (int i = 0; i < a.length(); ++i) {
                letters[a.charAt(i) - 'a']++;
            }
            for (int letter : letters) {
                if (letter > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < a.length(); ++i) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1)
                        second = i;
                    else {
                        return false;
                    }
                }
            }
            return (second != -1 && a.charAt(first) == b.charAt(second)) && (a.charAt(second) == b.charAt(first));
        }
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
