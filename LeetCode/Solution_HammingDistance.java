import org.jetbrains.annotations.Contract;

public class Solution_HammingDistance {
    @Contract(pure = true)
    private static int hammingDistance(int x, int y) {
        int count = 0;
        while (x > 0 || y > 0) {
            if (((x & 1) ^ (y & 1)) == 1)
                count++;
            x >>= 1;
            y >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
        System.out.println(hammingDistance(1, 5));
    }
}
