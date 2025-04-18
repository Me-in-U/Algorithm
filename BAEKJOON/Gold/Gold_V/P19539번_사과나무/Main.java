package BAEKJOON.Gold.Gold_V.P19539번_사과나무;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] goal = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            goal[i] = readInt();
        }
        int[] height = new int[N + 1];

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
