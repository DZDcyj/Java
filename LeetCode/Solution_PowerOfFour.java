import org.jetbrains.annotations.Contract;

public class Solution_PowerOfFour {
    @Contract(pure = true)
    private static boolean isPowerOfFour(int num) {
        return num == 1 || num == 4 || num == 16 ||
                num == 64 ||
                num == 256 ||
                num == 1024 ||
                num == 4096 ||
                num == 16384 ||
                num == 65536 ||
                num == 262144 ||
                num == 1048576 ||
                num == 4194304 ||
                num == 16777216 ||
                num == 67108864 ||
                num == 268435456 ||
                num == 1073741824;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        for (int i = 0; i <= 30; i++) {
            long res = (long) Math.pow(4.0, i);
            if (res > Integer.MAX_VALUE)
                break;
            System.out.println(res);
        }
    }
}
