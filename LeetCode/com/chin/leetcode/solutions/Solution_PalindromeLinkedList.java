package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

import java.util.Deque;
import java.util.LinkedList;

public class Solution_PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        @Contract(pure = true)
        ListNode(int x) {
            val = x;
        }
    }

    @Contract("null -> true")
    private static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // find the center list node
        ListNode pre = null;
        ListNode next;
        while (head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
