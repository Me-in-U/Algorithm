package BAEKJOON.Bronze.Bronze_III.P33541번_2025는_무엇이_특별할까;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int X = readInt();
        for (int i = X + 1; i <= 9999; i++) {
            int a = i / 100;
            int b = i % 100;
            if (Math.pow(a + b, 2) == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
