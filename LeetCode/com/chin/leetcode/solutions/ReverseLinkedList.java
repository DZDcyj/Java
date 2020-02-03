package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class ReverseLinkedList {


    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = new ListNode(0);
        // prev node

        return prev.next;
    }

    public static void main(String[] args) {
        ListNode test = ListNode.constructFromString("[1->2->3->4->5]");
        System.out.println(test);
        System.out.println(reverseList(test));
    }
}
