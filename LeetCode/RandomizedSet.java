import org.jetbrains.annotations.Contract;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
    private Map<Integer, Boolean> hashMap;
    private int size;

    /**
     * Initialize your data structure here.
     */
    @Contract(pure = true)
    public RandomizedSet() {
        size = 0;
        hashMap = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (hashMap.get(val) != null)
            return false;
        size++;
        hashMap.put(val, true);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (hashMap.get(val) == null)
            return false;
        size--;
        hashMap.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int count = 0;
        Random random = new Random();
        int max = random.nextInt(size);
        for (Map.Entry<Integer, Boolean> entry : hashMap.entrySet()) {
            if (count == max)
                return entry.getKey();
            count++;
        }
        return 0;
    }
}
