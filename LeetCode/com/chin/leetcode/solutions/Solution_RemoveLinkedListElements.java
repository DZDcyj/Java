package com.chin.leetcode.solutions;

import jdk.jshell.spi.SPIResolutionException;

public class Solution_RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(val - 1);
        result.next = head;
        ListNode curr = result;
        while (curr.next != null) {
            if (curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(1);
        ListNode result = removeElements(test, 1);
    }
}
