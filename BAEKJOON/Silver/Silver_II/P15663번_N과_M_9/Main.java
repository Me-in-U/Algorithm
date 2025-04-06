package BAEKJOON.Silver.Silver_II.P15663번_N과_M_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.LinkedHashSet;

public class Main {
  protected static int N, M;
  protected static boolean[] visited;
  protected static int[] output;
  protected static int[] num;

  protected static LinkedHashSet<String> set = new LinkedHashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    num = new int[N];
    output = new int[M];
    visited = new boolean[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(num);
    dfs(0);
    StringBuilder sb = new StringBuilder();
    for (String out : set) {
      sb.append(out).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static void dfs(int depth) {
    if (depth == M) {
      StringBuilder sb = new StringBuilder();
      for (int val : output) {
        sb.append(Integer.toString(val)).append(" ");
      }
      set.add(sb.toString().trim());
      return;
    }
    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        output[depth] = num[i];
        dfs(depth + 1);
        visited[i] = false;
      }
    }
  }
}