package BAEKJOON.Silver.Silver_III.P17626번_Four_Squares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static int[] dp;
  private static int min;
  private static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    dp = new int[N + 1];
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= N; i++) {
      min = Integer.MAX_VALUE;
      for (int j = 1; (j * j) <= i; j++) {
        int num = i - (j * j);
        min = Math.min(min, dp[num]);
      }
      dp[i] = min + 1;
    }
    System.out.println(dp[N]);
  }
}