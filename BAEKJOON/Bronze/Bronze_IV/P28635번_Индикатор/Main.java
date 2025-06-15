package BAEKJOON.Bronze.Bronze_IV.P28635번_Индикатор;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int a = readInt();
        int b = readInt();

        int result = (b - a + m) % m;
        System.out.println(result);
    }

    private static int readInt() throws IOException {
        int c = System.in.read();
        while (c <= ' ')
            c = System.in.read();

        int n = 0;
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return n;
    }
}
