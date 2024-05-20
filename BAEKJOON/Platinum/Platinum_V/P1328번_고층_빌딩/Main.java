package Platinum_V.P1328번_고층_빌딩;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    protected static long[][][] dp;
    protected static int mod = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        dp = new long[n + 1][n + 1][n + 1];
        solve(n, l, r);
        System.out.println(dp[n][l][r] % mod);
    }

    public static void solve(int n, int l, int r) {
        dp[1][1][1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i][i][1] = dp[i][1][i] = 1;
            for (int j = 1; j < l + 1; j++) {
                for (int k = 1; k < r + 1; k++) {
                    dp[i][j][k] = (dp[i - 1][j][k - 1] + dp[i - 1][j - 1][k]
                            + (dp[i - 1][j][k] * (i - 2))) % mod;
                }
            }
        }
    }
}