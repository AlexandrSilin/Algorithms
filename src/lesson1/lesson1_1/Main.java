package lesson1.lesson1_1;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 10;

//        Person p = new Person("Ivan");
////        Person p2 = new Person("Ivan");
////
////        if (p1.equals(p2)) {
////            System.out.println("равны");
////        } else {
////            System.out.println("не равны");
////        }
//
////        int a = 10;
////        a = inc(a);
////        System.out.println(a);
//
//        updateName(p);
//        System.out.println(p.getName());

//        int[] a = new int[]{1, 2, 3};
//        int[] b = new int[]{4, 5, 6};
//
//        b = a;
//        b[1] = 99;
//        a[2] = 77;
//        System.out.println(Arrays.toString(a));

        System.out.println(method4(100));
    }

    public static void updateName(Person p) {
        p.setName("Super " + p.getName());
    }

    public static int inc(int a) {
        return ++a;
    }

    //O(1)
    public static int method1(int[] arr, int n) {
        return arr[n];
    }

    //O(n)
    public static int method2(int[] arr, int x) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //O(sqrt(n))
    public static boolean method3(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int method4(int a) {
        int i;
        for (i = 1; i <= a; i *= 2) {

        }
        return i;
    }

    //O(n*n)
    public static int method5(int[][] arr, int x) {
        int a = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == x) {
                    return i * arr.length + j;
                }
            }
        }
        return -1;
    }


}
