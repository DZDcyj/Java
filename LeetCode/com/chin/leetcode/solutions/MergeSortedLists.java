package com.chin.leetcode.solutions;

import com.chin.leetcode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Chin
 */
public class MergeSortedLists {
    private static ListNode mergeLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });
        ListNode result = new ListNode(0);
        for (ListNode list : lists) {
            while (list != null) {
                ListNode temp = list;
                priorityQueue.offer(list);
                list = list.next;
                temp.next = null;
            }
        }
        ListNode temp = result;
        while (!priorityQueue.isEmpty()) {
            temp.next = priorityQueue.poll();
            temp = temp.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode testCase1 = ListNode.constructFromString("-2->-1->-1->-1");
        ListNode[] testCase = {testCase1, null};
        System.out.println(mergeLists(testCase));
    }
}
