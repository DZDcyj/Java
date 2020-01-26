package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MiddleOfTheLinkedList {
    private static final int FAST_STEPS = 2;

    private static ListNode middleNode(@NotNull ListNode head) {
        ListNode fast = head;
        ListNode midNode = head;
        while (fast != null) {
            for (int i = 0; i < FAST_STEPS; i++) {
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
