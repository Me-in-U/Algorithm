package BAEKJOON.Bronze.Bronze_IV.P27240번_Электричка;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt(), a = readInt(), b = readInt();
        int s = readInt(), t = readInt();

        boolean city = s > a && s < b && t > a && t < b;
        boolean outside = (s <= a && t <= a) || (s >= b && t >= b);
        System.out.println(city ? "City" : outside ? "Outside" : "Full");
    }

    private static int readInt() throws IOException {
        int c, x = 0;
        while ((c = System.in.read()) <= ' ')
            ;
        do {
            x = x * 10 + (c - '0');
        } while ((c = System.in.read()) >= '0' && c <= '9');
        return x;
    }
}
