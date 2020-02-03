package com.chin.leetcode.explore.recursion;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class SwapPairs {
    private static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else if (head.next.next == null) {
            ListNode next = head.next;
            head.next = null;
            next.next = head;
            return next;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }


    public static void main(String[] args) {
        ListNode testCase = ListNode.constructFromString("1->2->3->4->5->6");
        System.out.println(testCase);
        System.out.println(swapPairs(testCase));
    }
}
