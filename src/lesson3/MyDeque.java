package lesson3;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertFront(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
            //
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertBack(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        size++;
        list[begin] = item;
        begin = prevIndex(begin);
    }

    public T removeFront() {
        T temp = peekFront();
        list[begin] = null;
        begin = nextIndex(begin);
        size--;
        return temp;
    }

    public T removeBack() {
        T temp = peekFront();
        list[begin] = null;
        end = prevIndex(end);
        size--;
        return temp;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[begin];
    }

    public T peekEnd() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[end];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private int prevIndex(int index) { return (list.length + index - 1) % list.length; }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = begin, j = 0; j < size; i = nextIndex(i), j++) {
            sb.append(list[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
