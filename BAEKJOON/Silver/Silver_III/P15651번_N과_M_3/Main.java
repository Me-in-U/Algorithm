package BAEKJOON.Silver.Silver_III.P15651번_N과_M_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int[] arr;
  public static boolean[] visited;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    arr = new int[M];
    visited = new boolean[N];
    dfs(N, M, 0);

    System.out.print(sb);
  }

  public static void dfs(int N, int M, int depth) {
    if (depth == M) {
      for (int val : arr) {
        sb.append(val).append(' ');
      }
      sb.append('\n');
      return;
    }

    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        arr[depth] = i + 1;
        if (depth == M - 1) {
          visited[i] = true;
        }
        dfs(N, M, depth + 1);
        visited[i] = false;
      }
    }
  }
}
