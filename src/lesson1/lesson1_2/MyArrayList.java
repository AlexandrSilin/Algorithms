package lesson1.lesson1_2;

import java.util.Arrays;

public class MyArrayList<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity < 0 :" + capacity);
        }
        list = (T[]) new Comparable[capacity];
    }

    public MyArrayList() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public void add(T item) {
        if (size == list.length) {
            T[] list = (T[]) new Comparable[(int)(size * 1.5 + 1)];
            System.arraycopy(this.list, 0, list, 0, size - 1);
            this.list = list;
        }
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (index > size - 1 || index < 0) {
            throw new IllegalArgumentException("Bad index");
        }
        if (size == list.length) {
            T[] list = (T[]) new Comparable[(int)(size * 1.5 + 1)];
            System.arraycopy(this.list, 0, list, 0, size - 1);
            this.list = list;
        }
        if (size - index >= 0) System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = item;
        size++;
    }

    public final T delete(int index) {
        if (index > size - 1 || index < 0) {
            throw new IllegalArgumentException("Bad index");
        }
        T temp = list[index];
        if (size - index >= 0) System.arraycopy(list, index + 1, list, index, size - index);
        size--;
        return temp;
    }

    public boolean delete(T item) {
        int pos = index(item);
        if (pos < 0) {
            return false;
        }
        delete(pos);
        return true;
    }

    public T get(int index) {
        return index < size - 1 && index > 0 ? list[index] : null;
    }

    public void set(int index, T item) {
        if (index < size - 1 && index > 0) {
            list[index] = item;
        }
    }

    public int indexOf(T item) {
        return index(item);
    }

    private int index(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int iMin = i;
            for (int j = i; j < size; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }

    public void insertionSort() {
        T key;
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j - 1])) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                }
            }
        }
    }

    public void bubbleSortOpt() {
        boolean isSwap;
        for (int i = size - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }
}
