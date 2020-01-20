package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {

        }
    }

    private static ListNode middleNode(@NotNull ListNode head) {
        ListNode fast = head;
        ListNode midNode = head;
        while (fast != null) {
            for (int i = 0; i < 2; i++) {
                if (fast == null) {
                    return midNode;
                }
                fast = fast.next;
            }
            midNode = midNode.next;
        }
        return midNode;
    }
}
