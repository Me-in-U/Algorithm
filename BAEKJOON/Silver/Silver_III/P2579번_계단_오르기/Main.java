package BAEKJOON.Silver.Silver_III.P2579번_계단_오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] stair = new int[N + 1];
    int[] dp = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      stair[i] = Integer.parseInt(br.readLine());
    }
    // 첫번째 개단 최댓값 == 1개단 연속으로 밟음
    dp[1] = stair[1];
    if (N != 1) {
      // 두번째 개단 최댓값 == 2개단 연속으로 밟음
      dp[2] = stair[1] + stair[2];
    }
    // i == 도착지점
    // Math.max(2칸 점프, 1칸 점프) + stair[i]
    // 1칸 점프(전에 2칸 점프 했음)
    // 2칸 점프(이미 1칸 1칸 점프 했음)
    for (int i = 3; i <= N; i++) {
      dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
    }
    System.out.println(dp[N]);
  }
}