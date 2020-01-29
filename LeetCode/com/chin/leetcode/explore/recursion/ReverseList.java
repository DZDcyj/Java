package com.chin.leetcode.explore.recursion;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class ReverseList {
    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        ListNode next = reverseList(head.next);
        head.next = null;
        ListNode curr = next;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return next;
    }



    public static void main(String[] args) {
        ListNode testCase = ListNode.constructListNodeFromString("1->5");
        System.out.println(testCase);
        System.out.println(reverseList(testCase));
    }
}
