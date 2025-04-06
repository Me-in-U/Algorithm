package BAEKJOON.Silver.Silver_I.P2667번_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  protected static PriorityQueue<Integer> pq;
  protected static Deque<int[]> q;
  protected static int[] moveX = { 0, 0, -1, 1 };
  protected static int[] moveY = { -1, 1, 0, 0 };
  protected static boolean[][] house;
  protected static int N;

  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    pq = new PriorityQueue<>();
    q = new ArrayDeque<>();
    N = Integer.parseInt(br.readLine());
    house = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < N; j++) {
        if (line.charAt(j) - '0' == 1) {
          house[i][j] = true;
        }
      }
    }
    // !집이 있으면 거기서 BFS 시작
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (house[i][j]) {
          q.offer(new int[] { i, j });
          BFS();
        }
      }
    }
    // !출력
    StringBuilder sb = new StringBuilder();
    sb.append(pq.size()).append('\n');
    while (!pq.isEmpty()) {
      sb.append(pq.poll()).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static void BFS() {
    int count = 1;
    while (!q.isEmpty()) {
      int[] now = q.poll();
      house[now[0]][now[1]] = false;
      for (int i = 0; i < 4; i++) {
        int nextX = now[0] + moveX[i];
        int nextY = now[1] + moveY[i];
        if (0 <= nextX && 0 <= nextY && nextX < N && nextY < N) {
          if (house[nextX][nextY]) {
            count++;
            house[nextX][nextY] = false;
            q.add(new int[] { nextX, nextY });
          }
        }
      }
    }
    pq.add(count);
  }
}