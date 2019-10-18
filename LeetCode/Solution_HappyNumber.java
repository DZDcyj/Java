public class Solution_HappyNumber {
    private final static int[] SQUARE = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

    private static boolean isHappy(int n) {
        if (n == 1)
            return true;
        int result = 0;
        while (result != 1) {
            result = 0;
            while (n > 0) {
                result += SQUARE[n % 10];
                n /= 10;
            }
            if (result == 89)
                return false;
            n = result;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(55));
    }
}
