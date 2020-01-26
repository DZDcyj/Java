package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class DeleteNodeInLinkedList {

    private static void deleteNode(@NotNull ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
