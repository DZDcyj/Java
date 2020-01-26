package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class PalindromeLinkedList {

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
