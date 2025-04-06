package BAEKJOON.Silver.Silver_III.P10974번_모든_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int N;
  public static boolean[] visited;
  public static int[] result;
  public static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    visited = new boolean[N + 1];
    result = new int[N + 1];
    sb = new StringBuilder();
    dfs(1);
    System.out.print(sb.toString());
  }

  public static void dfs(int depth) {
    if (depth == N + 1) {
      for (int i = 1; i <= N; i++) {
        sb.append(result[i]).append(" ");
      }
      sb.append('\n');
      return;
    }
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        result[depth] = i;
        dfs(depth + 1);
        visited[i] = false;
      }
    }
  }
}