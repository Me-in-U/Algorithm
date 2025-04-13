package BAEKJOON.Bronze.Bronze_II.P2355번_시그마;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long a = readInt();
        long b = readInt();
        if (b > a) {
            long c = b;
            b = a;
            a = c;
        }
        long answer = (a + b) * (a - b + 1) / 2;
        System.out.print(answer);
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
