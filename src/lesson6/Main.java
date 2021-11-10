package lesson6;

public class Main {
    public static void main(String[] args) {
        int balanced = 0;
        for (int i = 0; i < 100000; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int item = 0;
            while (map.height() < 6) {
                item = (int) (-100 + Math.random() * 200);
                map.put(item, item);
            }
            map.delete(item);
            if (map.isBalance()) {
                balanced++;
            }
        }
        System.out.println("Balanced trees: " + (double)balanced / 100000 * 100 + "%");
    }
}
