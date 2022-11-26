package P8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
  // 하, 우, 상, 좌
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  static boolean[][] arr;
  static boolean[][] visited;

  static int M, N, days;
  static int count_zero;
  static boolean found;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new boolean[N][M];
    visited = new boolean[N][M];
    found = false;

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (num == 1) {
          arr[i][j] = true;
        }
      }
    }

    Queue<int[]> q = new LinkedList<>();

    // 처음부터 못찾으면 0
    q.offer(new int[] { 0, 0 });
    BFS(q);
    if (!found) {
      System.out.println("0");
    } else {
      // 하나 막아서 못찾으면 1
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if (!(i == 0 && j == 0) && !(i == N - 1 && j == M - 1) && !arr[i][j]) {
            found = false;
            // System.out.println(i + " " + j);
            arr[i][j] = true;
            visited = new boolean[N][M];
            q.offer(new int[] { 0, 0 });
            BFS(q);
            arr[i][j] = false;
            if (!found) {
              // System.out.println(i + " " + j);
              System.out.println("1");
              break;
            }
          }
        }
        if (!found) {
          break;
        }
      }
      // 아님 2
      if (found) {
        System.out.println("2");
      }
    }
  }

  public static void BFS(Queue<int[]> q) {
    Queue<int[]> temp = new LinkedList<>();
    while (!q.isEmpty()) {
      int[] now = q.poll();
      visited[now[0]][now[1]] = true;

      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        if (x >= 0 && y >= 0 && x < N && y < M) {
          if (!arr[x][y] && !visited[x][y]) {
            visited[x][y] = true;
            temp.add(new int[] { x, y });
            if (x == N - 1 && y == M - 1) {
              found = true;
              break;
            }
          }
        }
      }
    }
    if (!temp.isEmpty() && !found) {
      days++;
      BFS(temp);
    }
  }
}