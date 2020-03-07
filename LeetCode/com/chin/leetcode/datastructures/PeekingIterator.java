package com.chin.leetcode.datastructures;

import java.util.Iterator;

/**
 * @author Chin
 */
public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;

    private Integer peek;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (peek == null && iterator.hasNext()) {
            peek = iterator.next();
        }
        return peek;
    }

    @Override
    public Integer next() {
        int tmp = peek();
        if (iterator.hasNext()) {
            this.peek = iterator.next();
        } else {
            this.peek = null;
        }
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return this.peek != null || iterator.hasNext();
    }
}
