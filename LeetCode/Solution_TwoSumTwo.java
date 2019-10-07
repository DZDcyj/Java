import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Solution_TwoSumTwo {
    @Nullable
    @Contract(pure = true)
    private static int[] twoSum(@Nullable int[] numbers, int target) {
        if (numbers == null)
            return null;
        if (numbers.length <= 1)
            return null;
        int[] result = new int[2];
        int lo = 0, hi = numbers.length - 1;
        int sum;
        while (lo < hi) {
            sum = numbers[lo] + numbers[hi];
            if (sum < target)
                lo++;
            else if (sum > target)
                hi--;
            else {
                result[0] = lo + 1;
                result[1] = hi + 1;
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] test = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(test, 9)));
        System.out.println(Arrays.toString(twoSum(test, 16)));
    }
}
