package BAEKJOON.Bronze.Bronze_IV.P32710번_구구단표;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = read();
        if (N <= 10) {
            System.out.println(1);
            return;
        }
        if (81 < N) {
            System.out.println(0);
            return;
        }
        for (int i = 2; i <= 9; i++) {
            if (N % i == 0 && (N / i) <= 9) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);

    }

    public static int read() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
