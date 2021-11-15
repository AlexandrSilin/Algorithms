package lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(5, 9999999);
//        System.out.println(map.get(5));
//        map.put(5, 77777);
//        System.out.println(map.get(5));


        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        int tmp = 0;
        for (int i = 0; i < 7 ; i++) {
            int rand = random.nextInt(100);
            tmp = rand;
            map.put(rand, "a");
        }
        System.out.println(map);
        map.remove(tmp);
        System.out.println("tmp = " + tmp);
        System.out.println(map);

//        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(97);
//        lphm.put(5, "qwe");
//        lphm.put(15, "qweerwer");
//        System.out.println(lphm.get(15));
    }
}
