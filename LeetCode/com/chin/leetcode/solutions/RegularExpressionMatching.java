package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class RegularExpressionMatching {

    private static final char STAR = '*';

    // TODO: Understand the principle

    private Result[][] memo;

    enum Result {
        // TRUE stands for true, FALSE stands for false
        TRUE, FALSE
    }

    private boolean isMatch(@NotNull String s, @NotNull String p) {
        memo = new Result[s.length() + 1][p.length() + 1];
        return dp(0, 0, s, p);
    }

    private boolean dp(int i, int j, String text, String pattern) {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if (j == pattern.length()) {
            ans = i == text.length();
        } else {
            boolean firstMatch = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j + 1) == STAR) {
                ans = (dp(i, j + 2, text, pattern) ||
                        firstMatch && dp(i + 1, j, text, pattern));
            } else {
                ans = firstMatch && dp(i + 1, j + 1, text, pattern);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }

    public static void main(String[] args) {
        RegularExpressionMatching solutionRegularExpressionMatching = new RegularExpressionMatching();
        System.out.println(solutionRegularExpressionMatching.isMatch("aa", "a"));
        System.out.println(solutionRegularExpressionMatching.isMatch("aa", "a*"));
        System.out.println(solutionRegularExpressionMatching.isMatch("ab", ".*"));
        System.out.println(solutionRegularExpressionMatching.isMatch("aab", "c*a*b"));
        System.out.println(solutionRegularExpressionMatching.isMatch("mississippi", "mis*is*p*"));
    }
}
