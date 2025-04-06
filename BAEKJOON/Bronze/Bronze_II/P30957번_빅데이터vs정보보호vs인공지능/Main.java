package BAEKJOON.Bronze.Bronze_II.P30957번_빅데이터vs정보보호vs인공지능;

import java.io.IOException;

public class Main {
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

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int B = 0, S = 0, A = 0;

        for (int i = 0; i < N; i++) {
            int c = System.in.read();
            if (c == 'B') {
                B++;
            } else if (c == 'S') {
                S++;
            } else if (c == 'A') {
                A++;
            }
        }

        if (B == S && S == A) {
            System.out.println("SCU");
        } else {
            int max = Math.max(B, Math.max(S, A));
            if (B == max)
                System.out.print("B");
            if (S == max)
                System.out.print("S");
            if (A == max)
                System.out.print("A");
        }
    }
}
