package BAEKJOON.Gold.Gold_IV.P14002번_가장_긴_증가하는_부분_수열_4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N = readInt();
        int[] seq = new int[N];
        for (int i = 0; i < N; i++)
            seq[i] = readInt();
        int[] LIS = new int[N + 1];
        int[] dp = new int[N];

        LIS[0] = -1_000_000_001;
        int len = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            int key = seq[i];
            if (LIS[len] < key) {
                LIS[++len] = key;
                dp[i] = len;
            } else {
                int left = 0;
                int right = len;
                while (left < right) {
                    int mid = (left + right) >>> 1;
                    if (LIS[mid] < key) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                dp[i] = idx = right;
                LIS[idx] = seq[i];
            }
        }

        sb.append(len).append('\n');
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = N - 1; i >= 0; i--) {
            if (dp[i] == len) {
                dq.push(seq[i]);
                len--;
            }
        }
        while (!dq.isEmpty()) {
            sb.append(dq.pop()).append(' ');
        }
        System.out.println(sb.toString());
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