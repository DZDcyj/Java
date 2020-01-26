package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * @author Chin
 */
public class RemoveOuterMostParentheses {
    @NotNull
    private static String removeOuterParentheses(@NotNull String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0, right;
        boolean origin = false;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
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
                    stringBuilder.append(s, left + 1, right);
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
