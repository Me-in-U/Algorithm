package BAEKJOON.Bronze.Bronze_III.P14579번_덧셈과_곱셈;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum = (sum * (aTobSum(1, i) % 14579)) % 14579;
        }
        System.out.print(sum);
    }

    private static int aTobSum(int a, int b) {
        return (((b - a + 1) * (a + b)) / 2);
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
