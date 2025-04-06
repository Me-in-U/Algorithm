package BAEKJOON.Silver.Silver_III.P28438번_행렬_연산_행렬_계산하기;

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
    int Q = Integer.parseInt(st.nextToken());
    int[] rowSum = new int[N];
    int[] colSum = new int[M];

    for (int i = 0; i < Q; i++) {
      st = new StringTokenizer(br.readLine());
      int calc = Integer.parseInt(st.nextToken());
      int rc = Integer.parseInt(st.nextToken()) - 1;
      int v = Integer.parseInt(st.nextToken());
      if (calc == 1) {
        rowSum[rc] += v;
      } else {
        colSum[rc] += v;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(rowSum[i] + colSum[j]).append(" ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}
