package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class RemoveDuplicatesFromSortedList {

    @Contract("null -> null")
    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        int currVal;
        while (curr.next != null) {
            currVal = curr.val;
            if (curr.next.val == currVal) {
                if (curr.next.next != null) {
                    curr.next = curr.next.next;
                    continue;
                } else {
                    curr.next = null;
                }
            }
            curr = curr.next;
            if (curr == null) {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test1 = ListNode.constructListNodeFromString("1->1->2");
        ListNode test2 = ListNode.constructListNodeFromString("[1->1->2->3->3]");
        ListNode test3 = new ListNode(3);
        System.out.println(deleteDuplicates(test1).toString());
        System.out.println(deleteDuplicates(test2).toString());
        System.out.println(deleteDuplicates(test3).toString());
    }
}
