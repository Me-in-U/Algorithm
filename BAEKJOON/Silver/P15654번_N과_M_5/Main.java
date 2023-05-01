package P15654번_N과_M_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, M;

  static int[] input;
  static int[] arr;
  static boolean[] visit;  

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    input = new int[N];    
    arr = new int[M];
    visit = new boolean[N];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      input[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(input);
    
    dfs(0);

    System.out.println(sb);
  }
  private static void dfs(int depth) {
    if (depth == M) {
      for (int val : arr) {
        sb.append(val).append(" ");
      }
      sb.append("\n");
      return;
    }
    for (int i = 0; i < N; i++) {
      if (!visit[i]) {
        visit[i] = true;
        arr[depth] = input[i];
        dfs(depth + 1);
        visit[i] = false;
      }
    }
  }
}