import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class Solution_EvaluateReversePolishNotation {
    private static int evalRPN(@NotNull String[] tokens) {
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
        String[] RPN1 = {"2", "1", "+", "3", "*"};
        String[] RPN2 = {"4", "13", "5", "/", "+"};
        String[] RPN3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(RPN1));
        System.out.println(evalRPN(RPN2));
        System.out.println(evalRPN(RPN3));

    }
}
