package BAEKJOON.Silver.Silver_I.P11403번_경로_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  protected static int N;
  protected static boolean[][] arr;
  protected static boolean[][] visited;
  protected static boolean[] reachable;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    // 입력
    N = Integer.parseInt(br.readLine());
    arr = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        if (Integer.parseInt(st.nextToken()) == 1)
          arr[i][j] = true;
        else
          arr[i][j] = false;
      }
    }
    // 계산
    for (int i = 0; i < N; i++) {
      visited = new boolean[N][N];
      reachable = new boolean[N];
      solve(i);
      for (int j = 0; j < N; j++) {
        if (reachable[j])
          sb.append("1").append(" ");
        else
          sb.append("0").append(" ");
      }
      sb.append('\n');
    }
    // 출력
    System.out.print(sb.toString());
  }

  public static void solve(int i) {
    for (int j = 0; j < N; j++) {
      if (arr[i][j] && !visited[i][j]) {
        visited[i][j] = true;
        reachable[j] = true;
        solve(j);
      }
    }
  }
}