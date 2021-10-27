package lesson1.lesson1_1;

public class BinaryOperation {
    public static void main(String[] args) {
        int x = -167;
        int y = 300;

        printNum(x);
//        printNum(y);

//        int z = x & y;
//        printNum(z);

//        int z = x | y;
//        printNum(z);

//        int z = x ^ y;
//        printNum(z);

//        int z = ~x ;
//        printNum(z);

//        int z = ~x ;
//        z++;
//        printNum(z);

//        int z = x << 2;
//        printNum(z);

//        int z = x >> 10;
//        printNum(z);

        int z = x >>> 10;
        printNum(z); 

    }

    public static void printNum(int x) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while (sb.length() < 32) {
            sb.insert(0, "0");
        }
        System.out.printf("%5d = %s\n", x, sb);
    }
}
