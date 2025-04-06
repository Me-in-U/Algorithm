package BAEKJOON.Gold.Gold_IV.P11404번_플로이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    // !변수 설정
    int INF = 111111111;
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int[][] distance = new int[N][N];
    // !distance 초기화
    for (int i = 0; i < N; i++) {
      Arrays.fill(distance[i], INF);
      distance[i][i] = 0;
    }
    // !입력
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken()) - 1;
      int to = Integer.parseInt(st.nextToken()) - 1;
      int cost = Integer.parseInt(st.nextToken());
      distance[from][to] = Math.min(distance[from][to], cost);
    }
    // // !초기 cost
    // System.out.println("\nINTI");
    // for (int from = 0; from < N; from++) {
    // for (int to = 0; to < N; to++) {
    // if (distance[from][to] == INF) {
    // System.out.print("INF ");
    // } else {
    // System.out.print(distance[from][to] + " ");
    // }
    // }
    // System.out.println();
    // }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          if (distance[j][k] > distance[j][i] + distance[i][k]) {
            distance[j][k] = distance[j][i] + distance[i][k];
          }
        }
      }
    }
    // !출력
    StringBuilder sb = new StringBuilder();
    for (int from = 0; from < N; from++) {
      for (int to = 0; to < N; to++) {
        if (distance[from][to] == 0 || distance[from][to] == INF) {
          sb.append("0 ");
        } else {
          sb.append(distance[from][to] + " ");
        }
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}