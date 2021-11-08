package lesson5;

public class Backpack {

    private final Item[] items;
    private int capacity;
    private int price;

    public Backpack(Item[] items, int capacity) {
        this.items = items;
        this.capacity = capacity;
    }

    public int findBestPrice(int index) {
        if(index < 0) {
            return 0;
        }
        if (items[index].getWeight() <= capacity) {
            capacity -= items[index].getWeight();
            price += items[index].getPrice();
        }
        return findBestPrice(--index);
    }

    public int getPrice() {
        return price;
    }
}
