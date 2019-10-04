import java.util.Arrays;

public class Solution_MergeSortedArray {

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        // the m stands for the amount of valid elements in nums1
        // the n stands for the amount of valid elements in nums2
        // TODO: there is a faster func, can I make it?(Using two pointers)
        int index = 0;
        while (index < n) {
            nums1[index + m] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 0, 0, 0};
        int[] test2 = {2, 5, 6};
        merge(test1, 3, test2, 3);
        System.out.println(Arrays.toString(test1));
    }
}
