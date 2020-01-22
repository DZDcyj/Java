package com.chin.leetcode.solutions;

import java.util.Stack;

public class Solution_BaseballGame {
    private static int calPoints(String[] ops) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if ("C".equals(op)) {
                stack.pop();
            } else if ("D".equals(op)) {
                stack.push(stack.peek() * 2);
            } else if ("+".equals(op)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2);
                stack.push(num1);
                stack.push(num1 + num2);
            } else {
                stack.push(Integer.parseInt(op));
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
