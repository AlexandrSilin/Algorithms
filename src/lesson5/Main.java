package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println(pow(2, -3));
        System.out.println(pow(2, 3));
        Item[] items = {new Item(1, 3),
                new Item(6, 4),
                new Item(4, 5),
                new Item(7, 8),
                new Item(6, 9)};
        Backpack backpack = new Backpack(items, 13);
        backpack.findBestPrice(items.length - 1);
        System.out.println(backpack.getPrice());
    }

    private static double pow(double n, int degree) {
        if (n == 0) {
            throw new ArithmeticException();
        }
        if (degree == 0) {
            return 1;
        }
        return degree < 0 ? 1 / (n * pow(n, ++degree)) : pow(n, --degree) * n;
    }
}
