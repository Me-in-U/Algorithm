package BAEKJOON.Gold.Gold_V.P16928번_뱀과_사다리_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int[] snake_ladder;
  private static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    visited = new boolean[101];
    snake_ladder = new int[101];

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      snake_ladder[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      snake_ladder[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
    }
    bfs();
  }

  public static void bfs() {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] { 1, 0 });
    boolean done = false;
    while (!q.isEmpty() && !done) {
      int[] now_data = q.poll();
      int now_pos = now_data[0];
      int now_count = now_data[1];
      visited[now_pos] = true;
      for (int i = 1; i <= 6; i++) {
        int next = now_pos + i;
        if (!visited[next] && next < 100) {
          if (snake_ladder[next] != 0)
            q.add(new int[] { snake_ladder[next], now_count + 1 });
          else
            q.add(new int[] { next, now_count + 1 });
        } else if (next == 100) {
          System.out.println(now_count + 1);
          done = true;
          break;
        }
      }
    }
  }
}