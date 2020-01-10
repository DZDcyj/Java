package com.chin.leetcode.solutions;

public class Solution_SplitAStringInBalancedStrings {
    private static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }
}
