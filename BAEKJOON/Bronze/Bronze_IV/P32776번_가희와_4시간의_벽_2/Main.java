package BAEKJOON.Bronze.Bronze_IV.P32776번_가희와_4시간의_벽_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int Sab = readInt();
        int Ma = readInt();
        int Fab = readInt();
        int Mb = readInt();
        System.out.print(((Sab <= (Ma + Fab + Mb)) || (Sab <= 240)) ? "high speed rail" : "flight");
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
