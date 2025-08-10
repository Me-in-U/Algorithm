package BAEKJOON.Bronze.Bronze_III.P15236번_Dominos;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long N = readInt();
        long ans = (N * (N + 1) / 2) * (N + 2);

        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        System.out.print(sb);
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
