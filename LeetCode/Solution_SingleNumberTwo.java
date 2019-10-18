import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_SingleNumberTwo {
    @Contract(pure = true)
    private static int singleNumber(@NotNull int[] nums) {
        /*
        int result = 0;
        for (int i = 0; i < 32; i++) {          // Here we count every count of every bit 1
            int count = 0;
            for (int num : nums) {
                if ((num >> i & 1) == 1)
                    count++;
            }
            if (count % 3 != 0)
                result = result | 1 << i;       // If the count can't be divided by 3, it means the bit of the single element is 1
        }
        return result;
        */
        int k1 = 0, k2 = 0, mask = 0;
        for (int num : nums) {
            k2 ^= k1 & num;
            k1 ^= num;
            mask = ~(k1 & k2);
            k2 &= mask;
            k1 &= mask;
        }
        return k1;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 2, 3, 2};
        int[] test2 = {0, 1, 0, 1, 0, 1, 99};
        int[] test3 = {1};
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
        System.out.println(singleNumber(test3));
    }
}
