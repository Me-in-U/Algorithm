package BAEKJOON.Gold.Gold_V.P17836번_공주님을_구해라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int N, M, T, time, princess_time, sword_time;
  private static int[][] arr;
  private static boolean[][] visited;
  private static boolean found_sword, found_princess;

  // 상, 하, 좌, 우
  private static int[] dx = { -1, 1, 0, 0 };
  private static int[] dy = { 0, 0, -1, 1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    T = Integer.parseInt(st.nextToken());
    time = 0;
    princess_time = T + 1;
    sword_time = T + 1;

    arr = new int[N][M];

    visited = new boolean[N][M];

    found_sword = false;
    found_princess = false;

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[] { 0, 0 });
    BFS(q);

    if (found_princess) {
      int min_time = Math.min(princess_time, sword_time);
      if (min_time <= T) {
        System.out.println(min_time);
      } else {
        System.out.println("Fail");
      }
    } else {
      if (found_sword && sword_time <= T) {
        System.out.println(sword_time);
      } else {
        System.out.println("Fail");
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
          if (!visited[x][y] && arr[x][y] != 1) {
            if ((x == N - 1) && (y == M - 1)) {
              found_princess = true;
              princess_time = (time + 1);
            } else if (arr[x][y] == 2) {
              found_sword = true;
              sword_time = (time + 1) + (N - 1 - x) + (M - 1 - y);
            }
            visited[x][y] = true;
            temp.add(new int[] { x, y });
          }
        }
      }
    }
    if (!temp.isEmpty()) {
      time++;
      BFS(temp);
    }
  }
}