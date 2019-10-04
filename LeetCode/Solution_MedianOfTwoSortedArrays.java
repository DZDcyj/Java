public class Solution_MedianOfTwoSortedArrays {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 1 && nums2.length == 1)
            return (nums1[0] + nums2[0]) / 2.0;
        if (nums1[nums1.length - 1] < nums2[0])
            return (nums1[nums1.length - 1] + nums2[0]) / 2.0;
        else if (nums2[nums2.length - 1] < nums1[0])
            return (nums2[nums2.length - 1] + nums1[0]) / 2.0;

        return 0.0;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3};
        int[] test2 = {2};
        int[] test3 = {1, 2};
        int[] test4 = {3, 4};
        System.out.println(findMedianSortedArrays(test1, test2));
        System.out.println(findMedianSortedArrays(test3, test4));
    }
}
