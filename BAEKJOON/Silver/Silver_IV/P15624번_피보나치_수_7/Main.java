package BAEKJOON.Silver.Silver_IV.P15624번_피보나치_수_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    long[] dp = new long[N + 1];
    int div = 1000000007;
    dp[0] = 0;
    if (N != 0)
      dp[1] = 1;

    for (int i = 2; i <= N; i++) {
      dp[i] = ((dp[i - 1] % div) + (dp[i - 2] % div)) % div;
    }
    System.out.println(dp[N]);
  }
}