package P7562번_나이트의_이동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int count;
  private static boolean[][] visited;
  private static int[] dx = { -2, -2, -1, -1, 1, 1, 2, 2 };
  private static int[] dy = { -1, 1, -2, 2, -2, 2, -1, 1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int I = Integer.parseInt(br.readLine());

      st = new StringTokenizer(br.readLine());
      int[] now = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

      st = new StringTokenizer(br.readLine());
      int[] goal = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

      Queue<int[]> q = new LinkedList<>();
      q.add(now);
      count = 0;
      if (!(now[0] == goal[0] && now[1] == goal[1])) {
        visited = new boolean[I][I];
        bfs(q, goal, I);
      }
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static void bfs(Queue<int[]> q, int[] goal, int I) {
    Queue<int[]> temp = new LinkedList<>();
    boolean found = false;
    count++;
    while (!q.isEmpty()) {
      int[] now = q.poll();
      visited[now[0]][now[1]] = true;

      for (int i = 0; i < 8; i++) {
        int x = now[0] + dx[i];
        int y = now[1] + dy[i];
        if (x >= 0 && y >= 0 && x < I && y < I) {
          if (!visited[x][y]) {
            if (x == goal[0] && y == goal[1]) {
              found = true;
              break;
            }
            visited[x][y] = true;
            temp.add(new int[] { x, y });
          }
        }
      }
    }

    if (!found) {
      bfs(temp, goal, I);
    }
  }
}