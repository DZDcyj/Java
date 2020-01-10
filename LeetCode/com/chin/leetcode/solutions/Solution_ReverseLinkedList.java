package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        @Contract(pure = true)
        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode prev = new ListNode(0);        // prev node

        return prev.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);
        ListNode result = reverseList(test);
    }
}
