package BAEKJOON.Bronze.Bronze_III.P11772번_POT;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = readInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int p = readInt();
            int base = p / 10;
            int exp = p % 10;
            long term = 1;
            for (int k = 0; k < exp; k++)
                term *= base;
            sum += term;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb.toString());
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
