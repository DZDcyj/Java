package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class MyCircularQueue {
    private int capacity;
    private int size;
    private int[] storage;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    @Contract(pure = true)
    public MyCircularQueue(int k) {
        storage = new int[k];
        capacity = k;
        size = 0;
        head = 1;
        tail = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        tail = tail + 1;
        tail %= capacity;
        storage[tail] = value;
        size++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = head + 1;
        head %= capacity;
        size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int front() {
        if (size > 0) {
            return storage[head];
        }
        return -1;
    }

    /**
     * Get the last item from the queue.
     */
    public int rear() {
        if (size > 0) {
            return storage[tail];
        }
        return -1;
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == capacity;
    }

}
