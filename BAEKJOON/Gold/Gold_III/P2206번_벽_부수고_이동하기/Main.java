package P2206번_벽_부수고_이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  protected static int[] moveX = { -1, 1, 0, 0 };
  protected static int[] moveY = { 0, 0, -1, 1 };
  protected static int N;
  protected static int M;
  protected static boolean[][] wall;
  protected static boolean[][][] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] NM = br.readLine().split(" ");
    N = Integer.parseInt(NM[0]);
    M = Integer.parseInt(NM[1]);
    // ! 1X1 맵이면 이동할 곳 없음
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
    // !{X, Y, isBreak, distance}
    q.add(new int[] { 0, 0, 0, 1 });
    visited[0][0][0] = true;
    visited[0][0][1] = true;
    while (!q.isEmpty()) {
      int[] get = q.poll();
      int x = get[0];
      int y = get[1];
      int isBreak = get[2];
      int distance = get[3];
      // !(N, M)좌표에 도착
      if (x == N - 1 && y == M - 1) {
        return distance;
      }
      for (int j = 0; j < 4; j++) {
        int movedX = x + moveX[j];
        int movedY = y + moveY[j];
        if (0 <= movedX && 0 <= movedY && movedX < N && movedY < M) {
          if (!visited[movedX][movedY][isBreak]) {
            // ! 부순적 없음 && 통로
            if (isBreak == 0 && !wall[movedX][movedY]) {
              visited[movedX][movedY][0] = true;
              q.add(new int[] { movedX, movedY, 0, distance + 1 });
            } // !부순적 없음 && 벽
            else if (isBreak == 0 && wall[movedX][movedY]) {
              visited[movedX][movedY][0] = true;
              q.add(new int[] { movedX, movedY, 1, distance + 1 });
            } // !벽 하나 부숨 && 통로
            else if (isBreak == 1 && !wall[movedX][movedY]) {
              visited[movedX][movedY][1] = true;
              q.add(new int[] { movedX, movedY, 1, distance + 1 });
            }
          }
        }
      }
    }
    return -1;
  }
}