package BAEKJOON.Bronze.Bronze_II.P10813번_공_바꾸기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] balls = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      balls[i] = i;
    }
    while (M-- > 0) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      balls[0] = balls[i];
      balls[i] = balls[j];
      balls[j] = balls[0];
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= N; i++) {
      sb.append(balls[i]).append(' ');
    }
    System.out.print(sb.toString());
  }
}