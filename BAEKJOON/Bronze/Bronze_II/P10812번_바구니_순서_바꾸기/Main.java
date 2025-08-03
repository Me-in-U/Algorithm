package BAEKJOON.Bronze.Bronze_II.P10812번_바구니_순서_바꾸기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++)
            baskets[i] = i + 1;

        for (int op = 0; op < M; op++) {
            int i = readInt();
            int j = readInt();
            int k = readInt();
            int len = j - i + 1;
            int[] tmp = new int[len];
            int idx = 0;
            for (int x = k; x <= j; x++)
                tmp[idx++] = baskets[x - 1];
            for (int x = i; x < k; x++)
                tmp[idx++] = baskets[x - 1];
            for (int x = 0; x < len; x++)
                baskets[i - 1 + x] = tmp[x];
        }

        for (int i = 0; i < N; i++) {
            sb.append(baskets[i]);
            if (i < N - 1)
                sb.append(' ');
        }
        System.out.println(sb);
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
