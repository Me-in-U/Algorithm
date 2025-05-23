package BAEKJOON.Gold.Gold_V.P3067번_Coins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] coins = new int[N + 1];
            for (int i = 1; i <= N; i++)
                coins[i] = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(br.readLine());
            int[] dp = new int[M + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (j - coins[i] > 0) {
                        dp[j] += dp[j - coins[i]];
                    } else if (j - coins[i] == 0) {
                        dp[j]++;
                    }
                }
            }
            sb.append(dp[M]).append('\n');
        }
        System.out.print(sb);
    }
}