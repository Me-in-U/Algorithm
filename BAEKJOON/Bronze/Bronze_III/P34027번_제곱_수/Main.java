package BAEKJOON.Bronze.Bronze_III.P34027번_제곱_수;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int T = readInt();
        StringBuilder sb = new StringBuilder(T * 2);
        for (int i = 0; i < T; i++) {
            int N = readInt();
            int r = (int) Math.sqrt(N);
            sb.append(r * r == N ? "1" : "0").append("\n");
        }
        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
