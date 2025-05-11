package BAEKJOON.Bronze.Bronze_V.P33178번_Micromasters;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        System.out.println(n / 10);
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
