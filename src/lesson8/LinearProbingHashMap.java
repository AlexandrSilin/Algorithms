package lesson8;

public class LinearProbingHashMap<K, V> {
    private int capacity;
    private int size;

    private K[] keys;
    private V[] values;

    public LinearProbingHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private int hash2(K key) {
        return 5 - (key.hashCode() & 0x7fffffff) % 5;
    }


    public boolean contains(K key) {
        return get(key) != null;
    }

    public void checkKeyNotNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
    }

    public void put(K key, V value) {
        if (size == capacity - 1) {
            throw new RuntimeException("is full");
        }
        checkKeyNotNull(key);
        int i;
        int step = hash2(key);
        for (i = hash(key); keys[i] != null; i = (i + step) % capacity) {
            if (key.equals(keys[i])) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public V get(K key) {
        checkKeyNotNull(key);
        int step = hash2(key);
        for (int i = hash(key); keys[i] != null; i = (i + step) % capacity) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null;
    }


}
