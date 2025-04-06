package BAEKJOON.Silver.Silver_V.P2167번_2차원_배열의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    // 배열 입력
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] arr = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 합할 부분 계산
    int K = Integer.parseInt(br.readLine());
    for (int t = 0; t < K; t++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken()) - 1;
      int j = Integer.parseInt(st.nextToken()) - 1;
      int x = Integer.parseInt(st.nextToken()) - 1;
      int y = Integer.parseInt(st.nextToken()) - 1;
      int sum = 0;
      for (int k = i; k <= x; k++) {
        for (int l = j; l <= y; l++) {
          sum += arr[k][l];
        }
      }
      sb.append(sum).append('\n');
    }
    System.out.print(sb.toString());
  }
}