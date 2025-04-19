package BAEKJOON.Bronze.Bronze_III.P26645번_성장의_비약_선택권;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int level = readInt();
        int result = 4;
        if (level < 206) {
            result = 1;
        } else if (level < 218) {
            result = 2;
        } else if (level < 229) {
            result = 3;
        }
        System.out.print(result);
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
