package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Chin
 */
public class Question24 {

    /**
     * This function reverse the given ListNode
     *
     * @param head The head of given ListNode
     * @return The head of reversed ListNode
     */
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        ListNode result = null;
        boolean first = true;
        while (!stack.isEmpty()) {
            if (first) {
                result = stack.pop();
                curr = result;
                first = false;
            } else {
                curr.next = stack.pop();
                curr = curr.next;
            }
        }
        if (curr != null) {
            curr.next = null;
        }
        return result;
    }

    @TestOnly
    public static void main(String[] args) {
        Question24 question24 = new Question24();
        ListNode test = ListNode.constructFromString("1->2->3->4->5");
        System.out.println(ListNode.toString(test));
        ListNode result = question24.reverseList(test);
        System.out.println(ListNode.toString(result));
    }
}
