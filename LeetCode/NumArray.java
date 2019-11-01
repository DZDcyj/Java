import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NumArray {
    private int[] sums;
    private int[] nums;

    @Contract(pure = true)
    private NumArray(@NotNull int[] nums) {
        this.sums = new int[nums.length];
        this.nums = nums;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            this.sums[i] = sum;
        }
    }

    @Contract(pure = true)
    private int sumRange(int i, int j) {
        return this.sums[j] - this.sums[i] + this.nums[i];
    }

    public static void main(String[] args) {
        int[] test = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(test);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
