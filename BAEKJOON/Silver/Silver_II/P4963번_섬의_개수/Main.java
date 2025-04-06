package BAEKJOON.Silver.Silver_II.P4963번_섬의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static boolean[][] arr;
  private static boolean[][] visited;
  // -----------------------상,하,좌,우,좌상,우상,좌하,우하
  private static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
  private static int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1 };
  private static int count;
  private static int h;
  private static int w;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());
      if (w == 0 && h == 0) {
        break;
      }
      count = 0;
      arr = new boolean[h][w];
      visited = new boolean[h][w];
      Queue<int[]> q = new LinkedList<>();
      for (int i = 0; i < h; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < w; j++) {
          if (Integer.parseInt(st.nextToken()) == 1) {
            arr[i][j] = true;
            q.add(new int[] { i, j });
          }
        }
      }
      bfs(q);
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static void bfs(Queue<int[]> q) {
    while (!q.isEmpty()) {
      int[] now = q.poll();
      if (!visited[now[0]][now[1]]) {
        // System.out.println("시작 - x : " + now[0] + ", y :" + now[1]);
        visited[now[0]][now[1]] = true;
        count++;

        Queue<int[]> temp = new LinkedList<>();
        temp.add(new int[] { now[0], now[1] });
        while (!temp.isEmpty()) {
          int[] temp_now = temp.poll();
          for (int i = 0; i < 8; i++) {
            int x = temp_now[0] + dx[i];
            int y = temp_now[1] + dy[i];
            if (x >= 0 && y >= 0 && x < h && y < w) {
              if (arr[x][y] && !visited[x][y]) {
                // System.out.println("다음 - x : " + x + ", y :" + y);
                temp.add(new int[] { x, y });
                visited[x][y] = true;
              }
            }
          }
        }
      }
    }
  }
}
