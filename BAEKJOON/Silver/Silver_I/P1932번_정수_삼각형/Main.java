package BAEKJOON.Silver.Silver_I.P1932번_정수_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int n = Integer.parseInt(br.readLine());
    int[][] dp = new int[n + 1][n + 1];
    int[][] cost = new int[n + 1][n + 1];

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= i; j++) {
        cost[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    dp[1][1] = cost[1][1];
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == 1) {
          dp[i][j] = cost[i][j] + dp[i - 1][j];
        } else {
          dp[i][j] = cost[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
        }
      }
    }
    int max = 0;
    for (int i = 1; i <= n; i++) {
      if (dp[n][i] > max) {
        max = dp[n][i];
      }
    }
    System.out.println(max);
  }
}