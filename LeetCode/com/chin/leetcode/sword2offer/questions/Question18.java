package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.ListNode;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question18 {

    /**
     * @param head The head of ListNode
     * @param val  The target value to delete
     * @return The head of ListNode without target Node
     * <p>
     * Sample input:
     * <p>
     * 1.
     * head = 4 -> 5 -> 1 -> 9
     * val = 5
     * <p>
     * 2.
     * head = 4 -> 5 -> 1 -> 9
     * val = 1
     * <p>
     * Sample output:
     * <p>
     * 1.
     * 4 -> 1 -> 9
     * <p>
     * 2.
     * 4 -> 5 -> 9
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        } else if (head.val == val) {
            return head.next;
        }
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                ListNode temp = curr.next;
                curr.next = temp.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    @TestOnly
    public static void main(String[] args) {
        Question18 question18 = new Question18();
        ListNode testCase1 = ListNode.constructFromString("4->5->1->9");
        ListNode testCase2 = ListNode.constructFromString("4->5->1->9");
        ListNode errorCase1 = ListNode.constructFromString("-3,5,99", ",");
        System.out.println(ListNode.toString(question18.deleteNode(testCase1, 5)));
        System.out.println(ListNode.toString(question18.deleteNode(testCase2, 1)));
        System.out.println(ListNode.toString(question18.deleteNode(errorCase1, -3)));
    }
}
