package BAEKJOON.Gold.Gold_IV.P28423번_게임;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int L = readInt();
        int R = readInt();

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
