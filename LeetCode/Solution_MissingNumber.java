import org.jetbrains.annotations.Contract;

public class Solution_MissingNumber {
    @Contract(pure = true)
    private static int missingNumber(int[] nums) {
        int sum = 0;
        int noMissing = (nums.length + 1) * nums.length / 2;
        for (int num : nums) {
            sum += num;
        }
        return noMissing - sum;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 0, 1};
        int[] test2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(test1));
        System.out.println(missingNumber(test2));
    }
}
