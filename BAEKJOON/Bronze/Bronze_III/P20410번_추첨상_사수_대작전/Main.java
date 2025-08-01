package BAEKJOON.Bronze.Bronze_III.P20410번_추첨상_사수_대작전;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int seed = readInt();
        int x1 = readInt();
        int x2 = readInt();

        for (int a = 1; a < m; a++) {
            for (int c = 1; c < m; c++) {
                if ((a * seed + c) % m == x1 && (a * x1 + c) % m == x2) {
                    System.out.println(a + " " + c);
                    return;
                }
            }
        }
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
