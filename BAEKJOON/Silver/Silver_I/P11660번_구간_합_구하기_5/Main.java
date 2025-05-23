package BAEKJOON.Silver.Silver_I.P11660번_구간_합_구하기_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] data_dp = new int[N + 1][N + 1];
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        data_dp[i][j] = data_dp[i][j - 1] + Integer.parseInt(st.nextToken());
      }
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int sum = 0;
      for (int j = x1; j <= x2; j++) {
        sum += data_dp[j][y2] - data_dp[j][y1 - 1];
      }
      sb.append(sum).append('\n');
    }
    System.out.print(sb.toString());
  }
}