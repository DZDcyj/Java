package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

/**
 * @author Chin
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode curr = l1;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = l2;
        while (curr.next != null) {
            curr = curr.next;
        }
        quickSort(l1, curr);
        return l1;

    }

    private void quickSort(ListNode begin, ListNode end) {
        if (begin == null || end == null || begin == end) {
            return;
        }
        ListNode first = begin;
        ListNode second = begin.next;
        int nMidValue = begin.val;
        while (second != end.next && second != null) {
            if (second.val < nMidValue) {
                first = first.next;
                if (first != second) {
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
            }
            second = second.next;
        }
        if (begin != first) {
            int temp = begin.val;
            begin.val = first.val;
            first.val = temp;
        }
        quickSort(begin, first);
        quickSort(first.next, end);
    }
}
