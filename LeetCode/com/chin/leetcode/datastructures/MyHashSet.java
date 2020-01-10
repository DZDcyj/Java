package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

public class MyHashSet {
    private Node[] storage;

    private class Node {
        int val;
        Node next;

        @Contract(pure = true)
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    @Contract(pure = true)
    private static int getHash(int x) {
        return x % 10;
    }

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        storage = new Node[10];
        for (int i = 0; i < 10; i++)
            storage[i] = new Node(-1);
    }

    public void add(int key) {
        int hash = getHash(key);
        Node curr = storage[hash];
        if (curr.val == key)
            return;
        while (curr.next != null) {
            curr = curr.next;
            if (curr.val == key)
                return;
        }
        curr.next = new Node(key);
    }

    public void remove(int key) {
        int hash = getHash(key);
        Node curr = storage[hash];
        if (curr.val == key) {
            storage[hash] = storage[hash].next;
            return;
        }
        while (curr.next != null) {
            if (curr.next.val == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int hash = getHash(key);
        Node curr = storage[hash];
        while (curr != null) {
            if (curr.val == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));
        hashSet.add(2);
        System.out.println(hashSet.contains(2));
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
    }
}
