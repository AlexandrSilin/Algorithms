package lesson4;

public class MyLinkedQueue<T> {
    private MyLinketList<T> list;

    public MyLinkedQueue() {
        this.list = new MyLinketList<>();
    }

    public void insert(T item){
        list.insertFirst(item);
    }

    public T remove(){
        return list.deleteLast();
    }

    public T peekFront(){
        return list.getLast();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
