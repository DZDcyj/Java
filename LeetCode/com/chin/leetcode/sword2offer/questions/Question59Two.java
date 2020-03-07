package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.sword2offer.datastructures.MaxQueue;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question59Two {

    @TestOnly
    public static void main(String[] args) {
        MaxQueue maxQueue1 = new MaxQueue();
        maxQueue1.pushBack(1);
        maxQueue1.pushBack(2);
        System.out.println(maxQueue1.maxValue());
        System.out.println(maxQueue1.popFront());
        System.out.println(maxQueue1.popFront());

        MaxQueue maxQueue2 = new MaxQueue();
        System.out.println(maxQueue2.popFront());
        System.out.println(maxQueue2.maxValue());
    }
}
