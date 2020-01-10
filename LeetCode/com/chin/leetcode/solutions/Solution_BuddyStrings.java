package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_BuddyStrings {
    private static boolean buddyStrings(@NotNull String A, @NotNull String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B)) {
            int[] letters = new int[26];
            for (int i = 0; i < A.length(); ++i)
                letters[A.charAt(i) - 'a']++;
            for (int letter : letters) {
                if (letter > 1)
                    return true;
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second)) && (A.charAt(second) == B.charAt(first));
        }
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
