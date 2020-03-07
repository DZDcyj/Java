package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class Question6 {

    /**
     * This function returns an array of ListNode in reverse
     *
     * @param head The head of ListNode
     * @return An array with ListNode's numbers in reverse
     * <p>
     * The length of ListNode is between 0 and 10000
     * <p>
     * Sample input:
     * head = [1, 3, 2]
     * <p>
     * Sample output:
     * [2, 3, 1]
     */
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Queue<Integer> queue = new LinkedList<>();
        while (head != null) {
            queue.offer(head.val);
            head = head.next;
        }
        int[] result = new int[queue.size()];
        int index = queue.size() - 1;
        while (!queue.isEmpty()) {
            result[index--] = queue.poll();
        }
        return result;
    }

    @TestOnly
    public static void main(String[] args) {
        Question6 question6 = new Question6();
        ListNode testCase = ListNode.constructFromString("1->3->2");
        System.out.println(Arrays.toString(question6.reversePrint(testCase)));
    }
}
