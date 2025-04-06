package BAEKJOON.Silver.Silver_III.P1463번_1로_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dp[] = new int[1000001];
        int before[] = new int[1000001];
        int n = Integer.parseInt(br.readLine());
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            before[i] = i - 1;
            // 3으로 나누기
            if (i % 3 == 0) {
                if (dp[i] > dp[i / 3] + 1) {
                    dp[i] = dp[i / 3] + 1;
                    before[i] = i / 3;
                }
            }
            // 2로 나누기
            if (i % 2 == 0) {
                if (dp[i] > dp[i / 2] + 1) {
                    dp[i] = dp[i / 2] + 1;
                    before[i] = i / 2;
                }
            }
        }
        System.out.println(dp[n]);
    }
}