package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
interface MountainArray {

    /**
     * This function is used for getting the target element in given index
     *
     * @param index The index of the mountain array
     * @return MountainArray[index]
     */
    int get(int index);

    /**
     * This function is used for getting the length of array
     *
     * @return The length of the Mountain Array
     */
    int length();
}

/**
 * @author Chin
 */
public class FindInMountainArray {

    private static int findInMountainArray(int target, @NotNull MountainArray mountainArr) {
        int length = mountainArr.length();
        int top = findMountainTop(mountainArr, 0, length - 1);
        int result = binarySearch(mountainArr, 0, top, target, true);
        if (result != -1) {
            return result;
        }
        return binarySearch(mountainArr, top, length - 1, target, false);
    }

    private static int findMountainTop(MountainArray mountainArray, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArray.get(mid) < mountainArray.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int binarySearch(MountainArray mountainArray, int left, int right, int target, boolean bigger) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (bigger) {
                if (mountainArray.get(mid) < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else {
                if (mountainArray.get(mid) > target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        if (mountainArray.get(left) == target) {
            return left;
        }
        return -1;
    }

}
