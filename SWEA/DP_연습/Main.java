package SWEA.DP_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(f1(N));
        System.out.println(f2(N));
    }

    // 재귀
    private static int f1(int N) {
        if (N == 1) {
            return 2;
        } else if (N == 2) {
            return 3;
        }
        return f1(N - 1) + f1(N - 2);
    }

    // 반복
    private static int f2(int N) {
        int[] dp = new int[N + 1];
        dp[1] = 2;
        dp[2] = 3;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}
