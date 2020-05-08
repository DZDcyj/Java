package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

import java.util.Stack;

/**
 * @author Chin
 */
public class AddTwoNumbersTwo {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode head = l1;
        while (head != null) {
            stack1.push(head.val);
            head = head.next;
        }
        head = l2;
        while (head != null) {
            stack2.push(head.val);
            head = head.next;
        }
        ListNode curr = null;
        boolean flag = false;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int currVal = 0;
            if (!stack1.isEmpty()) {
                currVal += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                currVal += stack2.pop();
            }
            if (flag) {
                currVal += 1;
                flag = false;
            }
            if (currVal >= 10) {
                flag = true;
                currVal -= 10;
            }
            ListNode temp = new ListNode(currVal);
            temp.next = curr;
            curr = temp;
        }
        if (flag) {
            ListNode first = new ListNode(1);
            first.next = curr;
            return first;
        }
        return curr;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.constructFromString("7->2->4->3");
        ListNode l2 = ListNode.constructFromString("5->6->4");
        System.out.println(ListNode.toString(addTwoNumbers(l1, l2)));

        ListNode err1 = ListNode.constructFromString("5");
        ListNode err2 = ListNode.constructFromString("5");
        System.out.println(ListNode.toString(addTwoNumbers(err1, err2)));
    }
}
