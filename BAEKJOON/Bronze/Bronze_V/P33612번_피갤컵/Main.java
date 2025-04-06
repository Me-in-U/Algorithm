package BAEKJOON.Bronze.Bronze_V.P33612번_피갤컵;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int Y = 2024;
        int M = 8;
        int baseTotal = Y * 12 + (M - 1);
        int offset = (N - 1) * 7;
        int totM = baseTotal + offset;
        int resultY = totM / 12;
        int resultM = totM % 12 + 1;
        System.out.print(resultY + " " + resultM);
    }

    private static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48) {
            n = (n * 10) + (c & 15);
        }
        if (c == 13)
            System.in.read();
        return n;
    }
}
