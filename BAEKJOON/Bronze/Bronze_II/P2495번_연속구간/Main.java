package BAEKJOON.Bronze.Bronze_II.P2495번_연속구간;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < 3; t++) {
            int num = readInt();
            String s = String.valueOf(num);
            int maxLen = 1;
            int cnt = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                if (cnt > maxLen) {
                    maxLen = cnt;
                }
            }
            sb.append(maxLen).append('\n');
        }
        System.out.print(sb);
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
