package BAEKJOON.Bronze.Bronze_III.P28214번_크림빵;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int P = readInt();

        int[] breads = new int[N * K];
        for (int i = 0; i < N * K; i++) {
            breads[i] = readInt();
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int zeroCount = 0;
            for (int j = 0; j < K; j++)
                if (breads[i * K + j] == 0)
                    zeroCount++;
            if (zeroCount < P)
                answer++;
        }

        System.out.println(answer);
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
