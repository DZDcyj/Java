import java.util.Stack;

public class Solution_ValidParentheses {
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (char i : c) {
            if (i == '(' || i == '[' || i == '{')
                stack.push(i);
            else if (i == ')') {
                if (stack.isEmpty() || !stack.pop().equals('('))
                    return false;
            } else if (i == ']') {
                if (stack.isEmpty() || !stack.pop().equals('['))
                    return false;
            } else if (i == '}') {
                if (stack.isEmpty() || !stack.pop().equals('{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        System.out.println(isValid(test1));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
        System.out.println(isValid("]"));
    }
}
