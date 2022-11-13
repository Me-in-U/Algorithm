package P15573번_채굴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  static int[][] arr;
  static boolean[][] visited;

  static int N, M, K, D, broken;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    Queue<int[]> q = new LinkedList<>();

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    arr = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // System.out.println("================");

    // bfs solve
    int start = 0;
    int end = 1000000;
    while (start != end) {
      int mid = (start + end) / 2;
      D = mid;
      broken = 0;
      visited = new boolean[N][M];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if ((i == 0 || j == 0 || j == M - 1) && (arr[i][j] <= D)) {
            q.offer(new int[] { i, j });
            visited[i][j] = true;
            broken++;
          }
        }
      }
      bfs(q);
      if (broken < K) {
        start = mid + 1;
      } else {
        end = mid;
      }
      // System.out.println(D + " " + broken);
    }
    System.out.println(start);
  }

  public static void bfs(Queue<int[]> q) {
    Queue<int[]> temp = new LinkedList<>();
    while (!q.isEmpty()) {
      int[] now = q.poll();
      visited[now[0]][now[1]] = true;
      // search
      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        // 해당 인덱스가 배열을 넘어가면 안됨
        if (x >= 0 && y >= 0 && x < N && y < M) {
          if ((arr[x][y] <= D) && !visited[x][y]) {
            visited[x][y] = true;
            temp.add(new int[] { x, y });
            broken++;
            // System.out.println("(" + x + ", " + y + ")" + broken);
          }
        }
      }
    }
    if (!temp.isEmpty()) {
      bfs(temp);
    }
  }
}