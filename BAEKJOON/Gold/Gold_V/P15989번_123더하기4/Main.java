package BAEKJOON.Gold.Gold_V.P15989번_123더하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[10001];
        dp[0] = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 10000; j++) {
                dp[j] += dp[j - i];
            }
        }
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append('\n');
        }
        System.out.print(sb.toString().trim());
    }
}
