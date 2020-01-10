package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_ConvertBinaryNumberInALinkedListToInteger {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static int getDecimalValue(@NotNull ListNode head) {
        int num = 0;
        while (head != null) {
            num |= head.val;
            num <<= 1;
            head = head.next;
        }
        num >>= 1;
        return num;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(0);
        head1.next.next = new ListNode(1);

        ListNode head2 = new ListNode(0);

        ListNode head3 = new ListNode(1);

        int[] vals = {1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        ListNode head4 = new ListNode(vals[0]);
        ListNode temp = head4;
        for (int i = 1; i < vals.length; i++) {
            head4.next = new ListNode(vals[i]);
            head4 = head4.next;
        }
        head4 = temp;

        ListNode head5 = new ListNode(0);
        head5.next = new ListNode(0);

        System.out.println(getDecimalValue(head1));
        System.out.println(getDecimalValue(head2));
        System.out.println(getDecimalValue(head3));
        System.out.println(getDecimalValue(head4));
        System.out.println(getDecimalValue(head5));
    }
}
