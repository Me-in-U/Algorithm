package BAEKJOON.Platinum.Platinum_V.P14003번_가장_긴_증가하는_부분_수열_5;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] seq = new int[N];
        for (int i = 0; i < N; i++)
            seq[i] = readInt();
        int[] LIS = new int[N + 1];
        int[] dp = new int[N];
        LIS[0] = Integer.MIN_VALUE;
        int len = 0;
        for (int i = 0; i < N; i++) {
            int key = seq[i];
            if (LIS[len] < key) {
                LIS[++len] = key;
                dp[i] = len;
            } else {
                int index = Arrays.binarySearch(LIS, 0, len + 1, key);
                if (index < 0) {
                    index = -(index + 1);
                }
                LIS[index] = key;
                dp[i] = index;
                if (index > len) {
                    len = index;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(len).append("\n");
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = N - 1; i >= 0; i--) {
            if (dp[i] == len) {
                dq.addFirst(seq[i]);
                len--;
            }
        }
        while (!dq.isEmpty()) {
            sb.append(dq.removeFirst()).append(" ");
        }
        System.out.println(sb.toString());
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