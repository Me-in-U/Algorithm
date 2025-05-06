package BAEKJOON.Bronze.Bronze_III.P5612번_터널의_입구와_출구;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int carCount = readInt();
        int maxCarCount = carCount;
        boolean belowZero = carCount == 0;
        while (n-- > 0) {
            carCount = carCount + readInt() - readInt();
            if (maxCarCount < carCount)
                maxCarCount = carCount;
            if (carCount < 0) {
                belowZero = true;
                break;
            }
        }
        System.out.print(belowZero ? "0" : maxCarCount);
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
