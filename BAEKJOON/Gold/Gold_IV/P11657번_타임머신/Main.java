package BAEKJOON.Gold.Gold_IV.P11657번_타임머신;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {}

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
