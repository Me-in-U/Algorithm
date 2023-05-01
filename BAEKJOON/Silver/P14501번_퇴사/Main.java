package P14501번_퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int[] dp;
  public static int[][] advice;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    N = Integer.parseInt(br.readLine());
    dp = new int[N + 1];
    advice = new int[N][2];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      advice[i][0] = Integer.parseInt(st.nextToken());
      advice[i][1] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < N; i++) {
      dp(i);
      // for (int k = 1; k <= N; k++) {

      // System.out.print(dp[k] + " ");
      // }
      // System.out.println();
    }
    Arrays.sort(dp);
    System.out.print(dp[dp.length - 1]);
  }

  public static void dp(int i) {
    int day = i + advice[i][0];
    if (day <= N) {
      for (int k = day; k <= N; k++) {
        dp[k] = Math.max(dp[k], dp[i] + advice[i][1]);
      }
    }
  }
}