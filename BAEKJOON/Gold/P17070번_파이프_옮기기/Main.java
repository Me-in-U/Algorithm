package P17070번_파이프_옮기기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static boolean[][] walls;
  public static int N;
  public static Queue<int[]> queue = new LinkedList<>();
  public static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    walls = new boolean[N][N];
    StringTokenizer st = null;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        if (Integer.parseInt(st.nextToken()) == 1) {
          walls[i][j] = true;
        }
      }
    }
    queue.add(new int[] { 0, 0, 1 });
    if (!(walls[N - 1][N - 1] || (walls[N - 2][N - 2] && walls[N - 2][N - 1] && walls[N - 1][N - 2])))
      bfs();
    System.out.println(count);
  }

  public static void bfs() {
    while (!queue.isEmpty()) {
      int[] pipe = queue.poll();
      int direction = pipe[0];
      int X = pipe[1];
      int Y = pipe[2];
      // System.out.println(direction + " | " + X + " " + Y);
      if ((X == N - 1) && (Y == N - 1)) {
        count++;
        continue;
      }
      if (direction == 0) {
        direction0(X, Y);
      }
      if (direction == 1) {
        direction0(X, Y);
        direction2(X, Y);
      }
      if (direction == 2) {
        direction2(X, Y);
      }
      direction1(X, Y);
    }
  }

  // !가로
  public static void direction0(int X, int Y) {
    if (Y + 1 < N) {
      if (!walls[X][Y + 1]) {
        queue.add(new int[] { 0, X, Y + 1 });
      }
    }
  }

  // !대각선
  public static void direction1(int X, int Y) {
    if ((X + 1 < N) && (Y + 1 < N)) {
      if (!walls[X + 1][Y] && !walls[X][Y + 1] && !walls[X + 1][Y + 1]) {
        queue.add(new int[] { 1, X + 1, Y + 1 });
      }
    }
  }

  // !세로
  public static void direction2(int X, int Y) {
    if (X + 1 < N) {
      if (!walls[X + 1][Y]) {
        queue.add(new int[] { 2, X + 1, Y });
      }
    }
  }
}