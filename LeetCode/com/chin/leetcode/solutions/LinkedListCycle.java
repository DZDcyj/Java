package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class LinkedListCycle {

    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode oneStep = head;
        ListNode twoStep = head;
        while (true) {
            if (oneStep.next != null) {
                oneStep = oneStep.next;
            } else {
                return false;
            }
            if (twoStep == null) {
                return false;
            }
            if (twoStep.next != null) {
                twoStep = twoStep.next.next;
            } else {
                return false;
            }
            if (oneStep == twoStep) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        ListNode test1 = ListNode.constructFromString("[3->2->1->4]");
        test1.next.next.next.next = test1.next;

        System.out.println(hasCycle(test1));

        ListNode test2 = ListNode.constructFromString("1->2");
        test2.next.next = test2.next;

        System.out.println(hasCycle(test2));

        ListNode test3 = new ListNode(1);

        System.out.println(hasCycle(test3));

    }
}
