import java.util.LinkedList;
import java.util.Queue;

// structure Stack Based on Queue
public class MyStack {
    private Queue<Integer> stack;
    private Queue<Integer> queue;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
        size = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

    }

    /**
     * Get the top element.
     */
    public int top() {

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }

}
