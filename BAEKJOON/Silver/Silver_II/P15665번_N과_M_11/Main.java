package P15665번_N과_M_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  protected static int N, M;
  protected static int[] output;
  protected static Integer[] num;
  protected static StringBuilder sb;
  protected static HashSet<Integer> set = new HashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    output = new int[M];
    sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      set.add(Integer.parseInt(st.nextToken()));
    }
    N = set.size();
    num = new Integer[N];
    set.toArray(num);
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