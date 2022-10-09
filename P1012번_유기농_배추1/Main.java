package P1012번_유기농_배추1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  // 하, 우, 상, 좌
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  // arr true는 1
  static boolean[][] arr;
  static boolean[][] visited;

  // 가로, 세로, 지렁이
  static int M, N, count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;

    // T 케이스 반복
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      // 가로, 세로, 배추위치 입력
      st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      arr = new boolean[M][N];
      visited = new boolean[M][N];
      // 배추위치 입력
      int K = Integer.parseInt(st.nextToken());
      for (int j = 0; j < K; j++) {
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        arr[X][Y] = true;
      }
      // BFS계산
      // 해당 좌표값이 1이고 방문한적 없음
      for (int x = 0; x < M; x++) {
        for (int y = 0; y < N; y++) {
          if (arr[x][y] && !visited[x][y]) {
            BFS(x, y);
            count++;
          }
        }
      }
      sb.append(count).append('\n');
      count = 0;
    }
    System.out.print(sb.toString());
  }

  public static void BFS(int X, int Y) {
    // 방문한 좌표는 true
    visited[X][Y] = true;
    // 상하좌우로 탐색
    for (int k = 0; k < 4; k++) {
      int x = X + dx[k];
      int y = Y + dy[k];
      // 해당 인덱스가 배열을 넘어가면 안됨
      if (x >= 0 && y >= 0 && x < M && y < N) {
        // 해당 인덱스가 1이고 방문한적 없어야함
        if (arr[x][y] && !visited[x][y]) {
          BFS(x, y);
        }
      }
    }
  }
}