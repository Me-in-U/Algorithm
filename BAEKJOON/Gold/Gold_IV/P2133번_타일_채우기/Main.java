package BAEKJOON.Gold.Gold_IV.P2133번_타일_채우기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        if (n % 2 != 0) {
            System.out.print(0);
            return;
        }
        int[] dp = new int[n + 3];
        dp[0] = 1;
        dp[2] = 3;
        for (int i = 4; i <= n; i += 2) {
            dp[i] = 3 * dp[i - 2];
            for (int j = 4; j <= i; j += 2) {
                dp[i] += dp[i - j] << 1;
            }
        }
        System.out.print(dp[n]);
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