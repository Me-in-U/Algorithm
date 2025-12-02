package BAEKJOON.Bronze.Bronze_V.P34921번_덕후;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int A = readInt();
        int T = readInt();
        int P = 60 + 2 * (T - A);
        if (P < 0)
            P = 0;
        System.out.print(P);
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
