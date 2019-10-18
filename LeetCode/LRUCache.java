public class LRUCache {
    private int[] keys;
    private int[] values;
    private int[] usedtimes;
    private int capacity;
    private int length;
    private int usetime;

    public LRUCache(int capacity) {
        keys = new int[capacity];
        values = new int[capacity];
        usedtimes = new int[capacity];
        this.capacity = capacity;
        this.usetime = 1;
        this.length = 0;
        for (int i = 0; i < capacity; i++) {
            keys[i] = -1;
            values[i] = -1;
            usedtimes[i] = Integer.MAX_VALUE;
        }
    }

    public int get(int key) {
        for (int i = 0; i < capacity; i++) {
            if (key == keys[i]) {
                usedtimes[i] -= usetime;
                usetime += 2;
                return values[i];
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        for (int i = 0; i < capacity; i++) {
            if (keys[i] == key) {
                values[i] = value;
                usedtimes[i] -= usetime;
                usetime += 2;
                return;
            }
        }
        if (length < capacity) {
            keys[length] = key;
            values[length] = value;
            usedtimes[length] -= usetime;
            usetime += 2;
            length++;
        } else {
            int minUsedTimeIndex = 0;
            for (int i = 0; i < capacity; i++) {
                if (usedtimes[minUsedTimeIndex] < usedtimes[i])
                    minUsedTimeIndex = i;
            }
            keys[minUsedTimeIndex] = key;
            values[minUsedTimeIndex] = value;
            usedtimes[minUsedTimeIndex] -= usetime;
            usetime += 2;
        }
    }

    public static void main(String[] args) {
        /*
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));   // should be 1
        cache.put(3, 3);
        System.out.println(cache.get(2));   // should be -1
        cache.put(4, 4);
        System.out.println(cache.get(1));   // should be -1
        System.out.println(cache.get(3));   // should be 3
        System.out.println(cache.get(4));   // should be 4

        LRUCache test2 = new LRUCache(2);
        test2.put(2, 1);
        test2.put(2, 2);
        System.out.println(test2.get(2));       // should be 2
        test2.put(1, 1);
        test2.put(4, 1);
        System.out.println(test2.get(2));       // should be -1

        LRUCache test3 = new LRUCache(2);
        test3.put(2, 1);
        test3.put(1, 1);
        test3.put(2, 3);
        test3.put(4, 1);
        System.out.println(test3.get(1));       // should be -1
        System.out.println(test3.get(2));       // should be 3
        System.out.println();
*/
        LRUCache lruCache = new LRUCache(10);
        lruCache.put(10, 13);
        lruCache.put(3, 17);
        lruCache.put(6, 11);
        lruCache.put(10, 5);
        lruCache.put(9, 10);
        System.out.println(lruCache.get(13));       // should be -1
        lruCache.put(2, 19);
        System.out.println(lruCache.get(2));        // should be 19
        System.out.println(lruCache.get(3));        // should be 17
        lruCache.put(5, 25);
        System.out.println(lruCache.get(8));        // should be -1
        lruCache.put(9, 22);
        lruCache.put(5, 5);
        lruCache.put(1, 30);
        System.out.println(lruCache.get(11));       // should be -1
        lruCache.put(9, 12);
        System.out.println(lruCache.get(7));
        System.out.println(lruCache.get(5));
        System.out.println(lruCache.get(8));
        System.out.println(lruCache.get(9));
        lruCache.put(4, 30);
        lruCache.put(9, 3);
        System.out.println(lruCache.get(9));
        System.out.println(lruCache.get(10));
        System.out.println(lruCache.get(10));
        lruCache.put(6, 14);
        lruCache.put(3, 1);
        System.out.println(lruCache.get(3));
        lruCache.put(10, 11);
        System.out.println(lruCache.get(8));
        lruCache.put(2, 14);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(5));
        System.out.println(lruCache.get(4));
        lruCache.put(11, 4);
        lruCache.put(12, 24);
        lruCache.put(5, 18);
        System.out.println(lruCache.get(13));
        lruCache.put(7, 23);
        System.out.println(lruCache.get(8));
        System.out.println(lruCache.get(12));
        lruCache.put(3, 27);
        lruCache.put(2, 12);
        System.out.println(lruCache.get(5));
        lruCache.put(2, 9);
        lruCache.put(13, 4);
        lruCache.put(8, 18);
        lruCache.put(1, 7);
        System.out.println(lruCache.get(6));
        lruCache.put(9, 29);
        lruCache.put(8, 21);
        System.out.println(lruCache.get(5));
        lruCache.put(6, 30);
        lruCache.put(1, 12);
        System.out.println(lruCache.get(10));
        lruCache.put(4, 15);
        lruCache.put(7, 22);
        lruCache.put(11, 26);
        lruCache.put(8, 17);
        lruCache.put(9, 29);
        System.out.println(lruCache.get(5));
    }
}
