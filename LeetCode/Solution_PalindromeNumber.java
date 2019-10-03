public class Solution_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String numReversed = new StringBuilder(num).reverse().toString();
        if (num.equals(numReversed)) {
            System.out.println("It's a palindrome number!");
        } else {
            System.out.println("It's not a palindrome number.");
        }
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(-121);
        isPalindrome(10);
    }
}
