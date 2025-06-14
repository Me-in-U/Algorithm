package BAEKJOON.Bronze.Bronze_IV.P31134번_A_Hero_Named_Magnus;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long T = readInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            long x = readInt();
            sb.append(2 * x - 1).append("\n");
        }
        System.out.print(sb);
    }

    private static long readInt() throws IOException {
        int c = System.in.read();
        long n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
