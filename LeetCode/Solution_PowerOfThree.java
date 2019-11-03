import org.jetbrains.annotations.Contract;

public class Solution_PowerOfThree {
    @Contract(pure = true)
    private static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(45));
    }
}
