package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class MyCircularDeque {

    private int capacity;
    private int size;
    private int[] storage;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    @Contract(pure = true)
    public MyCircularDeque(int k) {
        capacity = k;
        storage = new int[capacity];
        size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (size > 0) {
            head--;
            if (head < 0) {
                head += capacity;
            }
        }
        storage[head] = value;
        size++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (size > 0) {
            tail++;
            tail %= capacity;
        }
        size++;
        storage[tail] = value;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head++;
        head %= capacity;
        size--;
        if (size == 0) {
            head = tail = 0;
        }
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail--;
        if (tail < 0) {
            tail += capacity;
        }
        size--;
        if (size == 0) {
            head = tail = 0;
        }
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return storage[head];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return storage[tail];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return size == capacity;
    }
}
