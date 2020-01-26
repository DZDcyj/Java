package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * @author Chin
 */
public class EvaluateReversePolishNotation {
    private static int evalRpn(@NotNull String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int num = stack.pop();
                    stack.push(stack.pop() / num);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] rpn1 = {"2", "1", "+", "3", "*"};
        String[] rpn2 = {"4", "13", "5", "/", "+"};
        String[] rpn3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRpn(rpn1));
        System.out.println(evalRpn(rpn2));
        System.out.println(evalRpn(rpn3));

    }
}
