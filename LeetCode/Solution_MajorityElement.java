import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_MajorityElement {
    private static int majorityElement(@NotNull int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(test1));
        System.out.println(majorityElement(test2));
    }
}
