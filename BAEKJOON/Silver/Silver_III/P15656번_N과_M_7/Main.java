package BAEKJOON.Silver.Silver_III.P15656번_N과_M_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  protected static int N, M;
  protected static int[] num;
  protected static StringBuilder sb = new StringBuilder();
  protected static boolean[] visited;
  protected static int[] output;

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

    System.out.print(sb.toString());
  }

  public static void dfs(int depth) {
    if (depth == M) {
      for (int val : output) {
        sb.append(Integer.toString(val)).append(" ");
      }
      sb.append('\n');
      return;
    }
    for (int i = 0; i < N; i++) {
      output[depth] = num[i];
      dfs(depth + 1);
    }
  }
}