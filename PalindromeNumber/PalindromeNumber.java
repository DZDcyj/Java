import java.util.Scanner;
import java.util.regex.Pattern;

// Palindrome number is a number that remains the same when its digits are reserved.
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        String num = scanner.next();
        if (isNumeric(num)) {
            String numReversed = new StringBuilder(num).reverse().toString();
            if (num.equals(numReversed)) {
                System.out.println("It's a palindrome number!");
            } else {
                System.out.println("It's not a palindrome number.");
            }
        }else{
            System.out.println("Please Enter the correct format of number!");
        }
    }
    private static boolean isNumeric(String str) {   // Check whether the inputs are all numbers
        Pattern pattern = Pattern.compile("[0-9]*");    // Using the regular expression
        return pattern.matcher(str).matches();
    }
}
