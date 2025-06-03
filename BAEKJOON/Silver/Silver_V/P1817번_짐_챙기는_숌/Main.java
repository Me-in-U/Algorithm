package BAEKJOON.Silver.Silver_V.P1817번_짐_챙기는_숌;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int boxCount = 0;
        int currentWeight = 0;
        for (int i = 0; i < N; i++) {
            int bookWeight = readInt();
            if (currentWeight + bookWeight > M) {
                boxCount++;
                currentWeight = bookWeight;
            } else {
                currentWeight += bookWeight;
            }
        }
        if (currentWeight > 0) {
            boxCount++;
        }
        System.out.print(boxCount);
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