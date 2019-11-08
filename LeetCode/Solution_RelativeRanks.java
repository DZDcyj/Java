import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_RelativeRanks {
    @NotNull
    private static String[] findRelativeRanks(@NotNull int[] nums) {
        String[] result = new String[nums.length];
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] group = new int[max + 1];
        for (int i = 0; i < nums.length; i++)
            group[nums[i]] = i + 1;
        for (int i = max, flag = 1; i >= 0; i--) {
            if (group[i] > 0) {
                switch (flag) {
                    case 1:
                        result[group[i] - 1] = "Gold Medal";
                        break;
                    case 2:
                        result[group[i] - 1] = "Silver Medal";
                        break;
                    case 3:
                        result[group[i] - 1] = "Bronze Medal";
                        break;
                    default:
                        result[group[i] - 1] = Integer.toString(flag);
                }
                flag++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(test)));
    }
}
