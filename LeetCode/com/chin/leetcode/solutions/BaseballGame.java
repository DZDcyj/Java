package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * @author Chin
 */
public class BaseballGame {
    private static int calPoints(@NotNull String[] ops) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2);
                    stack.push(num1);
                    stack.push(num1 + num2);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        while (!stack.empty()) {
            score += stack.pop();
        }
        return score;
    }

    public static void main(String[] args) {
        String[] op1 = {"5", "2", "C", "D", "+"};
        String[] op2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(op1));
        System.out.println(calPoints(op2));
    }
}
