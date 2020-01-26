package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * @author Chin
 */
public class ReverseOnlyLetters {
    @NotNull
    private static String reverseOnlyLetters(@NotNull String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                stringBuilder.append(stack.pop());
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEF-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
