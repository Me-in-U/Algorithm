package BAEKJOON.Silver.Silver_III.P11726번_2xn_타일링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        int n = Integer.parseInt(br.readLine());
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.print(dp[n]);
    }
}