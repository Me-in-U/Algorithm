package E숙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  protected static char[][] map;
  protected static int[][][] time;
  protected static int[] dx = { 0, 0, 1, -1 };
  protected static int[] dy = { 1, -1, 0, 0 };
  protected static int N;
  protected static int M;

  public static class Penguin {
    int x;
    int y;
    int time = 0;

    public Penguin() {
    }

    public Penguin(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public Penguin(int x, int y, int time) {
      this.x = x;
      this.y = y;
      this.time = time;
    }

    public void setPos(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    map = new char[N][M];
    time = new int[N][M][2];
    Penguin start = new Penguin();
    Penguin home = new Penguin();
    for (int i = 0; i < N; i++) {
      char[] c = br.readLine().toCharArray();
      for (int j = 0; j < M; j++) {
        if (c[j] == 'S') {
          start.setPos(i, j);
        } else if (c[j] == 'H') {
          home.setPos(i, j);
        }
        map[i][j] = c[j];
      }
    }
    BFS(start, 0);
    BFS(home, 1);
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (time[i][j][0] != 0 && time[i][j][1] != 0) {
          result = Math.min(result, time[i][j][0] + time[i][j][1]);
        }
      }
    }
    System.out.println(result == Integer.MAX_VALUE ? "-1" : result);
  }

  public static void BFS(Penguin from, int timeValue) {
    boolean[][] visited = new boolean[N][M];
    visited[from.x][from.y] = true;
    Deque<Penguin> Penguins = new ArrayDeque<>();
    Penguins.add(from);
    while (!Penguins.isEmpty()) {
      Penguin now = Penguins.poll();
      for (int i = 0; i < 4; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];
        int nextTime = now.time + 1;
        if (0 <= nextX && 0 <= nextY && nextX < N && nextY < M) {
          if (!visited[nextX][nextY] && map[nextX][nextY] != 'D') {
            Penguin nextPenguin = new Penguin(nextX, nextY, nextTime);
            visited[nextX][nextY] = true;
            if (map[nextX][nextY] == 'F') {
              time[nextX][nextY][timeValue] = nextTime;
            }
            Penguins.add(nextPenguin);
          }
        }
      }
    }
  }
}