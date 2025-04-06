package BAEKJOON.Silver.Silver_I.P9465번_스티커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      int[][] arr = new int[2][N + 1];
      int[][] dp = new int[2][N + 1];
      for (int j = 0; j < 2; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int k = 1; k <= N; k++) {
          arr[j][k] = Integer.parseInt(st.nextToken());
        }
      }
      dp = arr;
      for (int k = 2; k <= N; k++) {
        dp[0][k] = Math.max(dp[1][k - 1], dp[1][k - 2]) + arr[0][k];
        dp[1][k] = Math.max(dp[0][k - 1], dp[0][k - 2]) + arr[1][k];
      }
      sb.append(Math.max(dp[0][N], dp[1][N])).append('\n');
    }
    System.out.print(sb.toString());
  }
}