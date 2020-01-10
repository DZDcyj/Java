package com.chin.leetcode.solutions;

import java.util.Stack;

public class Solution_RemoveOuterMostParentheses {
    private static String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0, right = 0;
        boolean origin = false;
        for (int i = 0; i < S.length(); i++) {
            char letter = S.charAt(i);
            if (letter == '(') {
                stack.push(letter);
                if (!origin) {
                    left = i;
                    origin = true;
                }
            } else {
                stack.pop();
                if (stack.empty()) {
                    right = i;
                    stringBuilder.append(S, left + 1, right);
                    origin = false;
                    left = right;
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }
}
