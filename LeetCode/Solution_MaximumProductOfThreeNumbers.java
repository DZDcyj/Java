import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_MaximumProductOfThreeNumbers {
    @Contract(pure = true)
    private static int maximumProduct(@NotNull int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 3, 2, 1};
        System.out.println(maximumProduct(test1));
        System.out.println(maximumProduct(test2));
    }
}
