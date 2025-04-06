package BAEKJOON.Bronze.Bronze_V.P32775번_가희와_4시간의_벽_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int S = readInt();
        int F = readInt();
        System.out.println(S <= F ? "high speed rail" : "flight");
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}