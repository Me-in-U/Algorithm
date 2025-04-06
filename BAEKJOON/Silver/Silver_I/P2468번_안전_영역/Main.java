package BAEKJOON.Silver.Silver_I.P2468번_안전_영역;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int[][] arr;
  private static boolean[][] visited;
  private static int count;
  private static int N;
  private static int max_height = 0;
  private static int max_count = 0;
  private static int[] dx = { -1, 1, 0, 0 };
  private static int[] dy = { 0, 0, 1, -1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        // 1 <= 높이 <= 100
        arr[i][j] = Integer.parseInt(st.nextToken());
        max_height = Math.max(max_height, arr[i][j]);
      }
    }
    for (int i = 0; i < max_height; i++) {
      visited = new boolean[N][N];
      count = 0;
      Queue<int[]> q = new LinkedList<>();
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          if (arr[j][k] > i) {
            q.add(new int[] { j, k });
          }
        }
      }
      bfs(q, i);
      // System.out.print(count + " ");
      max_count = Math.max(max_count, count);
    }
    System.out.println(max_count);
  }

  private static void bfs(Queue<int[]> q, int height) {
    while (!q.isEmpty()) {
      Queue<int[]> temp = new LinkedList<>();
      int[] now = q.poll();
      if (!visited[now[0]][now[1]]) {
        visited[now[0]][now[1]] = true;
        count++;
        temp.add(new int[] { now[0], now[1] });
      }

      while (!temp.isEmpty()) {
        int[] next = temp.poll();
        for (int i = 0; i < 4; i++) {
          int x = next[0] + dx[i];
          int y = next[1] + dy[i];
          if (x >= 0 && y >= 0 && x < N && y < N) {
            if (arr[x][y] > height && !visited[x][y]) {
              visited[x][y] = true;
              temp.add(new int[] { x, y });
            }
          }
        }
      }
    }
  }
}
