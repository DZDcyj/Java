public class MyHashMap {
    private Node[] nodes;

    private class Node {
        int val;
        int key;
        Node next;

        Node(int key, int val) {
            this.val = val;
            this.key = key;
            this.next = null;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        nodes = new Node[10];
        for (int i = 0; i < 10; i++) {
            nodes[i] = new Node(-1, -1);
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int hash = key % 10;
        Node curr = nodes[hash];
        if (curr.key == key) {
            curr.val = value;
            return;
        }
        while (curr.next != null) {
            curr = curr.next;
            if (curr.key == key) {
                curr.val = value;
                return;
            }
        }
        curr.next = new Node(key, value);
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int hash = key % 10;
        Node curr = nodes[hash];
        while (curr != null) {
            if (curr.key == key)
                return curr.val;
            curr = curr.next;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash = key % 10;
        Node curr = nodes[hash];
        if (curr.key == key) {
            nodes[hash] = nodes[hash].next;
            return;
        }
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}
