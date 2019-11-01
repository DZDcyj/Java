import java.util.Arrays;

public class Solution_ReverseString {
    private static void reverseString(char[] s) {
        if (s.length <= 1)
            return;
        int index = 0;
        while (index < s.length / 2) {
            char temp = s[index];
            s[index] = s[s.length - 1 - index];
            s[s.length - 1 - index] = temp;
            index++;
        }
    }

    public static void main(String[] args) {
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(test1);
        reverseString(test2);
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}
