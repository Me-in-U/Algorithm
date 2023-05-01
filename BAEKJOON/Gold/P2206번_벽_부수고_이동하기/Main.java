package P2206번_벽_부수고_이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static int[] moveX = { -1, 1, 0, 0 };
  public static int[] moveY = { 0, 0, -1, 1 };
  public static int N;
  public static int M;
  protected static boolean[][] wall;
  protected static boolean[][][] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] NM = br.readLine().split(" ");
    N = Integer.parseInt(NM[0]);
    M = Integer.parseInt(NM[1]);
    if (N == 1 && M == 1) {
      System.out.println("1");
    } else {
      wall = new boolean[N][M];
      visited = new boolean[N][M][2];
      for (int i = 0; i < N; i++) {
        String line = br.readLine();
        for (int j = 0; j < M; j++) {
          if (line.charAt(j) == '1') {
            wall[i][j] = true;
          }
        }
      }
      System.out.println(bfs());
    }
  }

  public static int bfs() {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] { 0, 0, 0, 1 });
    visited[0][0][0] = true;
    visited[0][0][1] = true;
    while (!q.isEmpty()) {
      int[] get = q.poll();
      int x = get[0];
      int y = get[1];
      int time = get[3];
      if (x == N - 1 && y == M - 1) {
        return time;
      }
      int isBreak = get[2];
      for (int j = 0; j < 4; j++) {
        int movedX = x + moveX[j];
        int movedY = y + moveY[j];
        if (0 <= movedX && movedX < N && 0 <= movedY && movedY < M) {
          if (!visited[movedX][movedY][isBreak]) {
            if (isBreak == 0 && !wall[movedX][movedY]) {
              visited[movedX][movedY][0] = true;
              q.add(new int[] { movedX, movedY, 0, time + 1 });
            } else if (isBreak == 0 && wall[movedX][movedY]) {
              visited[movedX][movedY][0] = true;
              q.add(new int[] { movedX, movedY, 1, time + 1 });
            } else if (isBreak == 1 && !wall[movedX][movedY]) {
              visited[movedX][movedY][1] = true;
              q.add(new int[] { movedX, movedY, 1, time + 1 });
            }
          }
        }
      }
    }
    return -1;
  }
}