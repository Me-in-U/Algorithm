package P2178번_미로_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
  // 하, 우, 상, 좌
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  static int[][] arr;
  static boolean[][] visited;

  static int N, M;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(input.substring(j, j + 1));
      }
    }

    BFS(0, 0);
    System.out.println(arr[N - 1][M - 1]);
  }

  public static void BFS(int i, int j) {
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[] { i, j });
    visited[i][j] = true;
    while (!q.isEmpty()) {
      int[] now = q.poll();
      // 상하좌우로 탐색
      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        // 해당 인덱스가 배열을 넘어가면 안됨
        if (x >= 0 && y >= 0 && x < N && y < M) {
          // 해당 인덱스가 0이아니고 방문한적 없어야함
          if (arr[x][y] != 0 && !visited[x][y]) {
            visited[x][y] = true;
            arr[x][y] = arr[now[0]][now[1]] + 1;
            q.add(new int[] { x, y });
          }
        }
      }
    }
  }
}