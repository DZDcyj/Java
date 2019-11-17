import org.jetbrains.annotations.NotNull;

public class Solution_MaxConsecutiveOnes {
    private static int findMaxConsecutiveOnes(@NotNull int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public static void main(String[] args) {
        int[] test = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(test));
    }
}
