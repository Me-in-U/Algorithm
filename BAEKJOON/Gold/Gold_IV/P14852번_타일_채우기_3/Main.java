package BAEKJOON.Gold.Gold_IV.P14852번_타일_채우기_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MOD = 1_000_000_007;
        int N = readInt();
        if (N == 1) {
            System.out.print("2");
            return;
        }
        long[] dp = new long[N + 1];
        long[] memo = new long[N + 1];
        dp[0] = 1; // 빈벽 또한 벽으로 하나로 취급
        dp[1] = 2;
        dp[2] = 7;
        for (int i = 3; i <= N; i++) {
            memo[i] = (dp[i - 3] + memo[i - 1]) % MOD;
            // 2개(1열로 가능한 유일) * 1열 미완성 +
            // 3개(2열로 가능한 유일) * 2열 미완성) +
            // 2개(i==3 이상부터 특수모양 2개씩)
            dp[i] = (2 * dp[i - 1] + 3 * dp[i - 2] + 2 * memo[i]) % MOD;
        }
        System.out.print(dp[N]);
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
