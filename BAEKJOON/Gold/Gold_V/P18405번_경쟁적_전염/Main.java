package BAEKJOON.Gold.Gold_V.P18405번_경쟁적_전염;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  private static int[][] arr;
  private static boolean[][] visited;
  // 상, 하, 좌, 우
  private static int[] dx = { -1, 1, 0, 0 };
  private static int[] dy = { 0, 0, -1, 1 };

  private static int N, time;
  private static int S, X, Y;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    st.nextToken();

    PriorityQueue<Point> pq = new PriorityQueue<>();
    arr = new int[N][N];
    visited = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        int num = Integer.parseInt(st.nextToken());
        arr[i][j] = num;
        if (num != 0) {
          pq.add(new Point(i, j));
          visited[i][j] = true;
        }
      }
    }

    st = new StringTokenizer(br.readLine());
    S = Integer.parseInt(st.nextToken());
    X = Integer.parseInt(st.nextToken());
    Y = Integer.parseInt(st.nextToken());

    if (S != 0) {
      BFS(pq);
    }
    System.out.println(arr[X - 1][Y - 1]);
  }

  public static void BFS(PriorityQueue<Point> pq) {
    PriorityQueue<Point> temp = new PriorityQueue<>();
    while (!pq.isEmpty()) {
      Point now = pq.poll();
      // System.out.println("cordinates | " + now.x + ", " + now.y + " | " +
      // arr[now.x][now.y]);
      for (int k = 0; k < 4; k++) {
        int x = now.x + dx[k];
        int y = now.y + dy[k];
        if (x >= 0 && y >= 0 && x < N && y < N) {
          if (arr[x][y] == 0 && !visited[x][y]) {
            visited[x][y] = true;
            arr[x][y] = arr[now.x][now.y];
            temp.add(new Point(x, y));
          }
        }
      }
    }
    if (!temp.isEmpty()) {
      // System.out.println("out | T = " + (time + 1));
      // for (int i = 0; i < N; i++) {
      // for (int j = 0; j < N; j++) {
      // System.out.print(arr[i][j] + " ");
      // }
      // System.out.println();
      // }
      if (++time != S) {
        BFS(temp);
      }
    }
  }

  private static class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Point o) {
      return arr[this.x][this.y] - arr[o.x][o.y];
    }
  }
}