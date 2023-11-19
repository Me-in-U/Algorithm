package P7569번_토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
  // 하, 우, 상, 좌 //z축 상, 하
  static int[] dx = { 0, 1, 0, -1, 0, 0 };
  static int[] dy = { 1, 0, -1, 0, 0, 0 };
  static int[] dz = { 0, 0, 0, 0, 1, -1 };

  static int[][][] arr;
  static boolean[][][] visited;

  static int M, N, H, days;
  static int count_zero;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    H = Integer.parseInt(st.nextToken());

    arr = new int[N][M][H];
    visited = new boolean[N][M][H];
    Queue<int[]> q = new LinkedList<>();
    for (int k = 0; k < H; k++) {
      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
          int num = Integer.parseInt(st.nextToken());
          if (num == 0) {
            count_zero++;
          } else if (num == 1) {
            q.offer(new int[] { i, j, k });
          } else {
            visited[i][j][k] = true;
          }
          arr[i][j][k] = num;
        }
      }
    }
    BFS(q);
    if (count_zero > 0) {
      System.out.println("-1");
    } else {
      System.out.println(days);
    }
  }

  public static void BFS(Queue<int[]> q) {
    Queue<int[]> temp = new LinkedList<>();
    while (!q.isEmpty()) {
      int[] now = q.poll();
      visited[now[0]][now[1]][now[2]] = true;

      // 상하좌우로 탐색
      for (int k = 0; k < 6; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        int z = now[2] + dz[k];
        // 해당 인덱스가 배열을 넘어가면 안됨
        if (x >= 0 && y >= 0 && z >= 0 && x < N && y < M && z < H) {
          // 해당 인덱스가 0이아니고 방문한적 없어야함
          // -1은 방문했다고 치자
          if (arr[x][y][z] == 0 && !visited[x][y][z]) {
            visited[x][y][z] = true;
            arr[x][y][z] = 1;
            count_zero--;
            temp.add(new int[] { x, y, z });
          }
        }
      }
    }
    if (!temp.isEmpty()) {
      days++;
      BFS(temp);
    }
  }
}