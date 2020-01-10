package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Solution_MedianOfTwoSortedArrays {
    /*
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Here I combine two arraylists, making the algorithm to be O(NlogN)
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        if ((nums.length & 1) == 1) {
            return nums[nums.length / 2];
        } else {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        }
    }
    */
    // TODO: Review the algorithm

    /**
     * @param nums1 the first array
     * @param nums2 the second array
     * @return the middle number of the array (nums1+nums2)
     * <p>
     * How does this function work?
     * We get the (n+m+1)th smallest element in nums1 and the (n+m+2)th smallest element in nums2
     * Then we get half of two elements sums, the result
     * @author windliang
     * @date 2019/10/9
     */
    @Contract("null, null -> fail")
    private static double findMedianSortedArrays(@Nullable int[] nums1, @Nullable int[] nums2) {
        assert !(nums1 == null && nums2 == null);
        // Here nums1 and nums2 will not be both null
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        // Here we combine the situation of odd and even, if odd, we do twice to figure out the same k
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    /**
     * @param nums1  the first array
     * @param nums2  the second array
     * @param start1 the start position we need to go on in nums1
     * @param start2 the start position we need to go on in nums2
     * @param end1   the end position we need to stop in nums1
     * @param end2   the end position we need to stop in nums2
     * @param k      the index of the element sorted array(nums[start] to nums[end])
     * @return the kth smallest element in combined array
     * <p>
     * How does this function work?
     * We get the kth smallest number, and remove the number which can't be the middle number
     * Then we start from the new array, until the k becomes 1
     * Then we got the number we need
     * @author windliang
     * @date 2019/10/9
     */
    private static int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        // We make the length of len1 smaller than len2, in this case, if there's a empty array, it must be len1
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];

        if (k == 1) return Math.min(nums1[start1], nums2[start2]);

        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        } else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1};
        int[] test2 = {2, 3};
        int[] test3 = {1, 2};
        int[] test4 = {3, 4};
        System.out.println(findMedianSortedArrays(test1, test2));
        System.out.println(findMedianSortedArrays(test3, test4));
    }
}
