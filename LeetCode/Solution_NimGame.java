import org.jetbrains.annotations.Contract;

public class Solution_NimGame {
    @Contract(pure = true)
    private static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(canWinNim(i));
        }
    }
}
