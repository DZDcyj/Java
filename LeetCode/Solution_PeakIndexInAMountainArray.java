import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_PeakIndexInAMountainArray {
    @Contract(pure = true)
    private static int peakIndexInMountainArray(@NotNull int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {0, 1, 0};
        int[] test2 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(test1));
        System.out.println(peakIndexInMountainArray(test2));
    }
}
