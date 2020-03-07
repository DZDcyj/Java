package com.chin.leetcode.programmersgetoffer;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class Question10 {

    /**
     * This function merge two arrays, a longer and a shorter
     * The sum of initialized elements in two arrays is same with the length of longer array
     *
     * @param longerList                          The storage list
     * @param shorterList                         The shorter list
     * @param amountOfInitializedElemInLongArray  The number of elements in longer array which is initialized
     * @param amountOfInitializedElemInShortArray The number of elements in shorter array which is initialized
     *                                            <p>
     *                                            Sample input:
     *                                            [1, 2, 3, 0, 0, 0]
     *                                            3
     *                                            [2, 5, 6]
     *                                            3
     *                                            <p>
     *                                            Sample output:
     *                                            [1, 2, 2, 3, 5, 6]
     */
    public void merge(@NotNull int[] longerList, int amountOfInitializedElemInLongArray, int[] shorterList, int amountOfInitializedElemInShortArray) {
        int indexOfLong = amountOfInitializedElemInLongArray - 1;
        int indexOfShort = amountOfInitializedElemInShortArray - 1;
        int cur, tail = longerList.length - 1;
        while (indexOfLong >= 0 || indexOfShort >= 0) {
            if (indexOfLong == -1) {
                cur = shorterList[indexOfShort--];
            } else if (indexOfShort == -1) {
                cur = longerList[indexOfLong--];
            } else if (longerList[indexOfLong] > shorterList[indexOfShort]) {
                cur = longerList[indexOfLong--];
            } else {
                cur = shorterList[indexOfShort--];
            }
            longerList[tail--] = cur;
        }
    }

    public static void main(String[] args) {
        Question10 question10 = new Question10();
        int[] testA = {1, 2, 3, 0, 0, 0};
        int[] testB = {2, 5, 6};
        question10.merge(testA, 3, testB, 3);
        for (int num : testA) {
            System.out.print(num + " ");
        }
    }
}
