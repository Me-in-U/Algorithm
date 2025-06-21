package BAEKJOON.Bronze.Bronze_IV.P33179번_PHezardastans_Annual_Report;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int pages = readInt();
            result += pages / 2 + (pages % 2);
        }
        System.out.println(result);
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
