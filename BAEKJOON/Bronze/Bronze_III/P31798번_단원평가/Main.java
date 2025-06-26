package BAEKJOON.Bronze.Bronze_III.P31798번_단원평가;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();

        int result;
        if (c == 0) {
            result = (int) Math.sqrt(a + b);
        } else if (a == 0) {
            result = c * c - b;
        } else {
            result = c * c - a;
        }

        System.out.println(result);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
