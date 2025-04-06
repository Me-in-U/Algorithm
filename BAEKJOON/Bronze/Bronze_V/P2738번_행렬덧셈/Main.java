package BAEKJOON.Bronze.Bronze_V.P2738번_행렬덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] NM = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        NM[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        sb.append((NM[i][j] + Integer.parseInt(st.nextToken())) + " ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}