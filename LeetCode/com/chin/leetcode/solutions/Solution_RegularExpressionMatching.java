package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_RegularExpressionMatching {
    // TODO: Understand the principle
    private Result[][] memo;
    enum Result {
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
            boolean first_match = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                ans = (dp(i, j + 2, text, pattern) ||
                        first_match && dp(i + 1, j, text, pattern));
            } else {
                ans = first_match && dp(i + 1, j + 1, text, pattern);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }

    public static void main(String[] args) {
        Solution_RegularExpressionMatching solution_regularExpressionMatching = new Solution_RegularExpressionMatching();
        System.out.println(solution_regularExpressionMatching.isMatch("aa", "a"));
        System.out.println(solution_regularExpressionMatching.isMatch("aa", "a*"));
        System.out.println(solution_regularExpressionMatching.isMatch("ab", ".*"));
        System.out.println(solution_regularExpressionMatching.isMatch("aab", "c*a*b"));
        System.out.println(solution_regularExpressionMatching.isMatch("mississippi", "mis*is*p*"));
    }
}
