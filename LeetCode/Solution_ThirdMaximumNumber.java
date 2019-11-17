import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class Solution_ThirdMaximumNumber {
    private static int thirdMax(@NotNull int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max;
        for (int i = 1; i <= Math.min(3, nums.length); i++) {
            max = Integer.MIN_VALUE;
            boolean changed = false;
            for (int num : nums) {
                if (num >= max && !set.contains(num)) {
                    max = num;
                    changed = true;
                }
            }
            if (changed)
                set.add(max);
        }
        Object[] objects = set.toArray();
        if (set.size() == 3)
            return (Integer) objects[0];
        if (set.size() == 2)
            return Math.max((Integer) objects[0], (Integer) objects[1]);
        return (Integer) objects[0];
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 1};
        int[] test2 = {1, Integer.MIN_VALUE, 2};
        int[] test3 = {2, 2, 3, 1};
        System.out.println(thirdMax(test1));
        System.out.println(thirdMax(test2));
        System.out.println(thirdMax(test3));
    }
}
