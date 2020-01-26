package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class RemoveLinkedListElements {

    private static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(val - 1);
        result.next = head;
        ListNode curr = result;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode test = ListNode.constructListNodeFromString("1->2->3");
        System.out.println(removeElements(test, 1).toString());
        System.out.println(removeElements(test, 2).toString());
    }
}
