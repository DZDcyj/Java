package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class MyLinkedList {
    private int size;
    private myNode first;

    private class myNode {
        int val;
        myNode next;

        @Contract(pure = true)
        public myNode() {

        }

        @Contract(pure = true)
        myNode(int val) {
            this.val = val;
        }

        @Contract(pure = true)
        myNode(int val, myNode n) {
            this.val = val;
            this.next = n;
        }
    }

    /**
     * Initialize your data structure here.
     */
    @Contract(pure = true)
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return -1;
        }
        myNode tmpNode = first;
        for (int i = 0; i < index; i++) {
            tmpNode = tmpNode.next;
        }
        return tmpNode.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        first = new myNode(val, first);
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        myNode tmpNode = first;
        for (int i = 0; i < size - 1; i++) {
            tmpNode = tmpNode.next;
        }
        tmpNode.next = new myNode(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        } else if (index > size) {
            return;
        }
        myNode tmp = first;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = new myNode(val, tmp.next);
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index > 0 && index < size) {
            myNode tmpNode = first;
            for (int i = 0; i < index - 1; i++) {
                tmpNode = tmpNode.next;
            }
            myNode deled = tmpNode.next;
            if (deled != null) {
                tmpNode.next = deled.next;
            }
            deled = null;
            size--;
            return;
        }
        if (index == 0 && size > 0) {
            myNode tmpNode = first;
            first = first.next;
            tmpNode = null;
        }
    }
}
