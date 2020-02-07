package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

/**
 * @author Chin
 */
public class MaximumGap {

    private static class Bucket {
        boolean used = false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    private int maximumGap(@NotNull int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }
        int bucketSize = Math.max(1, (maxi - mini) / (nums.length - 1));
        int bucketNum = (maxi - mini) / bucketSize + 1;

        Bucket[] buckets = new Bucket[bucketNum];
        for (int i = 0; i < bucketNum; i++) {
            buckets[i] = new Bucket();
        }
        for (int num : nums) {
            int index = (num - mini) / bucketSize;
            buckets[index].used = true;
            buckets[index].min = Math.min(num, buckets[index].min);
            buckets[index].max = Math.max(num, buckets[index].max);
        }

        int prevMax = mini, maxGap = 0;
        for (Bucket bucket : buckets) {
            if (!bucket.used) {
                continue;
            }
            maxGap = Math.max(maxGap, bucket.min - prevMax);
            prevMax = bucket.max;
        }
        return maxGap;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 6, 9, 1};
        int[] test2 = {10};
        MaximumGap gap = new MaximumGap();
        System.out.println(gap.maximumGap(test1));
        System.out.println(gap.maximumGap(test2));
    }
}
