package BAEKJOON.Silver.Silver_III.P9095번_123_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[10];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        int T = Integer.parseInt(br.readLine());
        for (int j = 3; j < 10; j++) {
            dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
        }
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N - 1]).append('\n');
        }
        System.out.print(sb.toString());
    }
}