package com.chin.datastructure;

// MyLinkedList: one direction: first to last
public class MyLinkedList<T> {
    private T value;                        // value saved
    private static int length;              // the length of link list
    private int index;
    private static MyLinkedList first;      // the first node of link list
    private static MyLinkedList last;       // the last node of link list
    private MyLinkedList next;              // the quote of next, default null

    public MyLinkedList(T value) {
        this.value = value;
        if (length == 0) {
            first = this;
            last = this;
        }
        this.index = length++;
    }

    public MyLinkedList getFirst() {
        return first;
    }

    public MyLinkedList getLast() {
        return last;
    }

    public T retrieve() {
        return this.value;
    }

    public void add(T value) {
        MyLinkedList temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        last = new MyLinkedList<>(value);
        temp.next = last;
    }

    public void insert(T value, int index) {
        if (index > length || index < 0) {
            return;
        } else if (index == length) {
            this.add(value);
            return;
        }
        MyLinkedList temp = first;
        while (temp.next != null) {
            if (temp.next.index == index) {
                break;
            }
            temp = temp.next;
        }
        MyLinkedList node = new MyLinkedList<>(value);
        node.index = index;
        node.next = temp.next;
        temp.next = node;
        temp = temp.next;
        while (temp.next != null) {
            temp = temp.next;
            temp.index++;
        }
    }

    public int getLength() {
        return length;
    }

    public void deleteByIndex(int index) {      // delete the element of target index
        if (length == 0)
            return;
        if (index > length - 1 || index < 0) {
            return;
        }
        if (length == 1) {
            first = null;
            last = null;
            length--;
        } else if (length == 2) {
            length--;
            if (index == 0) {
                first = last;
            } else {
                last = first;
            }
        } else {
            MyLinkedList temp = first;
            while (temp.next != null) {
                if (temp.next.index == index) {
                    break;
                }
                temp = temp.next;
            }
            if (index == 0) {
                temp = first.next;
                first = null;
                first = temp;
                first.index--;
                while (temp.next != null) {
                    temp = temp.next;
                    temp.index--;
                }
            } else if (temp.next.next != null) {
                temp.next = temp.next.next;
                while (temp.next != null) {
                    temp = temp.next;
                    temp.index--;
                }
            } else {
                temp.next = null;
            }
        }
    }

    public void deleteByValue(T value) {        // delete the element saved target value
        MyLinkedList temp = first;
        if (first.value == value) {
            first = first.next;
            temp = first;
            first.index--;
            while (temp.next != null) {
                temp = temp.next;
                temp.index--;
            }
        } else {
            while (temp.next != null && temp.next.value != value) {
                temp = temp.next;
            }
            if (temp.next != null) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                    while (temp.next != null) {
                        temp = temp.next;
                        temp.index--;
                    }
                } else {
                    temp.next = null;
                }
            }
        }
    }

    public MyLinkedList findElementByValue(T value) {
        if (first.value == value) {
            return first;
        } else {
            MyLinkedList temp = first;
            while (temp.next != null) {
                temp = temp.next;
                if (temp.value == value) {
                    return temp;
                }
            }
        }
        return null;
    }

    public MyLinkedList findElementByIndex(int index) {
        if (index == 0) {
            return first;
        } else if (length == 0 || index > length - 1 || index < 0) {
            return null;
        } else {
            MyLinkedList temp = first;
            while (temp.next != null) {
                temp = temp.next;
                if (temp.index == index) {
                    return temp;
                }
            }
        }
        return null;
    }
}
