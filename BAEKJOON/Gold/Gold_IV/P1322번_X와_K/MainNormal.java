package BAEKJOON.Gold.Gold_IV.P1322번_X와_K;

import java.io.IOException;

public class MainNormal {
    public static void main(String[] args) throws IOException {
        int X = readInt();
        int K = readInt();
        long answer = 0;
        long maskX = 1;
        long maskK = 1;
        while (maskK <= K) {
            while ((X & maskX) == maskX)
                maskX <<= 1;
            if ((K & maskK) == maskK)
                answer |= maskX;
            maskK <<= 1;
            maskX <<= 1;
        }
        System.out.print(answer);
    }

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
