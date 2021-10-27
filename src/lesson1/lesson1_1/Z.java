package lesson1.lesson1_1;

import java.io.*;
import java.util.*;

public class Z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a < b + c) {
            out.println("NO");
        } else {
            out.println("YES");
        }

        out.flush();
    }
}
