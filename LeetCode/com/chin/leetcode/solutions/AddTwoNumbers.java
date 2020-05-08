package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode realResult = new ListNode(0);
        boolean first = true;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                result.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                result.val += l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(0);
            if (result.val >= 10) {
                while (result.val >= 10) {
                    result.next.val += 1;
                    result.val -= 10;
                }
            }
            if (first) {
                realResult = result;
                first = false;
            }
            result = result.next;
        }
        ListNode temp = realResult;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        if (temp.next.val == 0) {
            temp.next = null;
        }
        return realResult;
    }

}
