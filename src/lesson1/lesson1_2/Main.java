package lesson1.lesson1_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 100000;
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100000));
        }

        long before = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("Selection sort: " + (System.currentTimeMillis() - before));
        for (int i = 0; i < n; i++) {
            mal.set(i, random.nextInt(100000));
        }

        before = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("Insertion sort: " + (System.currentTimeMillis() - before));
        for (int i = 0; i < n; i++) {
            mal.set(i, random.nextInt(100000));
        }

        before = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Bubble sort: " + (System.currentTimeMillis() - before));
        for (int i = 0; i < n; i++) {
            mal.set(i, random.nextInt(100000));
        }

        before = System.currentTimeMillis();
        mal.bubbleSortOpt();
        System.out.println("BubbleOpt sort: " + (System.currentTimeMillis() - before));
    }
}
