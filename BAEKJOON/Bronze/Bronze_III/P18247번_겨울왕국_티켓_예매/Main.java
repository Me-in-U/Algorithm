package BAEKJOON.Bronze.Bronze_III.P18247번_겨울왕국_티켓_예매;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int N = readInt();
            int M = readInt();
            sb.append((12 <= N && 4 <= M) ? 11 * M + 4 : -1).append('\n');
        }
        System.out.print(sb.toString());
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
