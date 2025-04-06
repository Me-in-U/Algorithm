package BAEKJOON.Silver.Silver_I.P14940번_쉬운_최단거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int[] start;
  private static int[] moveX = { 0, 0, 1, -1 };
  private static int[] moveY = { 1, -1, 0, 0 };

  private static class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    boolean[][] visited = new boolean[n][m];
    boolean[][] map = new boolean[n][m];
    int[][] distanceMap = new int[n][m];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (num == 2) {
          start = new int[] { i, j };
        } else if (num == 1) {
          map[i][j] = true;
        }
      }
    }
    // !BFS
    Queue<Coordinate> queue = new ArrayDeque<>();
    queue.add(new Coordinate(start[0], start[1]));
    visited[start[0]][start[1]] = true;
    int distance = 1;
    while (true) {
      Queue<Coordinate> temp = new ArrayDeque<>();
      while (!queue.isEmpty()) {
        Coordinate pos = queue.poll();
        for (int i = 0; i < 4; i++) {
          int nextX = pos.x + moveX[i];
          int nextY = pos.y + moveY[i];
          if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m) {
            if (map[nextX][nextY] && !visited[nextX][nextY]) {
              Coordinate next = new Coordinate(nextX, nextY);
              temp.add(next);
              distanceMap[nextX][nextY] = distance;
              visited[nextX][nextY] = true;
            }
          }
        }
      }
      if (!temp.isEmpty()) {
        queue = temp;
        distance++;
      } else {
        break;
      }
    }
    // !갈수 있는데 도달못한 땅
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] && !visited[i][j]) {
          distanceMap[i][j] = -1;
        }
      }
    }
    // !출력
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        sb.append(distanceMap[i][j]).append(' ');
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}