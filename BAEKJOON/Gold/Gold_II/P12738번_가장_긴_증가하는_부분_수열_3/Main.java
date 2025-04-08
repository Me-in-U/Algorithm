package BAEKJOON.Gold.Gold_II.P12738번_가장_긴_증가하는_부분_수열_3;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] seq = new int[N];
        for (int i = 0; i < N; i++)
            seq[i] = readInt();
        int[] LIS = new int[N + 1];
        LIS[0] = -1_000_000_001;
        int len = 0;
        for (int i = 0; i < N; i++) {
            int key = seq[i];
            if (LIS[len] < key) {
                LIS[++len] = key;
            } else {
                int index = Arrays.binarySearch(LIS, 0, len + 1, key);
                if (index < 0) {
                    index = -(index + 1);
                }
                LIS[index] = key;
                if (index > len) {
                    len = index;
                }
            }
        }
        System.out.print(len);
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}