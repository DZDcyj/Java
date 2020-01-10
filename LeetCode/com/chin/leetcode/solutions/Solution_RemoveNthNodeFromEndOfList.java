package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_RemoveNthNodeFromEndOfList {
    public static class ListNode {
        int val;
        ListNode next;

        @Contract(pure = true)
        ListNode(int x) {
            val = x;
        }
    }

    @Contract("_, _ -> param1")
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toHead = new ListNode(0);
        toHead.next = head;
        ListNode faster = toHead;
        ListNode curr = toHead;
        for (int i = 1; i <= n + 1; i++) {
            faster = faster.next;
        }
        while (faster != null) {
            faster = faster.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return toHead.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);
        ListNode result = removeNthFromEnd(test, 2);
        System.out.println(removeNthFromEnd(new ListNode(1), 1));
        System.out.println(result);
    }
}
