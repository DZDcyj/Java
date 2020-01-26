package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class RemoveNthNodeFromEndOfList {

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
        ListNode test = ListNode.constructListNodeFromString("1->2->3->4->5");
        System.out.println(removeNthFromEnd(test, 1));
        System.out.println(removeNthFromEnd(test, 2));
    }
}
