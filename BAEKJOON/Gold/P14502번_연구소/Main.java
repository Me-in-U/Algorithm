package P14502번_연구소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int M;
  public static int[][] lab_Original;
  public static int[][] lab_Wall;
  public static int max = 0;
  public static int[] move_x = { 1, -1, 0, 0 };
  public static int[] move_y = { 0, 0, 1, -1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    lab_Original = new int[N][M];
    lab_Wall = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        lab_Original[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 계산
    makeWall(0);
    System.out.print(max);
  }

  public static void makeWall(int depth) {
    if (depth == 3) {
      virus();
    } else {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if (lab_Original[i][j] == 0) {
            lab_Original[i][j] = 1;
            makeWall(depth + 1);
            lab_Original[i][j] = 0;
          }
        }
      }
    }
  }

  public static void virus() {
    for (int i = 0; i < N; i++) {
      lab_Wall[i] = lab_Original[i].clone();
    }
    Queue<int[]> queueVirus = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (lab_Wall[i][j] == 2) {
          queueVirus.add(new int[] { i, j });
        }
      }
    }
    while (!queueVirus.isEmpty()) {
      int[] now = queueVirus.poll();
      int x = now[0];
      int y = now[1];
      for (int i = 0; i < 4; i++) {
        int next_x = x + move_x[i];
        int next_y = y + move_y[i];
        if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < M) {
          if (lab_Wall[next_x][next_y] == 0) {
            lab_Wall[next_x][next_y] = 2;
            queueVirus.add(new int[] { next_x, next_y });
          }
        }
      }
    }
    countSafeZone();
  }

  public static void countSafeZone() {
    int count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (lab_Wall[i][j] == 0) {
          count++;
        }
      }
    }
    max = Math.max(max, count);
  }
}