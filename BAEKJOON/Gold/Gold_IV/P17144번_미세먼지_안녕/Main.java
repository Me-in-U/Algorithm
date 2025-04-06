package BAEKJOON.Gold.Gold_IV.P17144번_미세먼지_안녕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int R, C, T;
  static int[][] arr;
  static int[][] temp;
  static int air_purifier_up, air_purifier_down;
  // 하, 우, 상, 좌
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // 변수 입력
    st = new StringTokenizer(br.readLine());
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    T = Integer.parseInt(st.nextToken());

    arr = new int[R][C];
    // 배열 입력
    for (int i = 0; i < R; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < C; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 공기청정기 위치
    for (int i = 0; i < R; i++) {
      if (arr[i][0] == -1) {
        air_purifier_up = i;
        air_purifier_down = i + 1;
        break;
      }
    }
    // T시간 반복
    for (int i = 0; i < T; i++) {
      diffusion();
      // show_arr();
      clean_upside();
      clean_downside();
      // show_arr();
    }
    System.out.println(get_dust());
  }

  public static void show_arr() {
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void diffusion() {
    temp = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (arr[i][j] >= 5) {
          Queue<int[]> q = new LinkedList<>();
          for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && y >= 0 && x < R && y < C) {
              if (arr[x][y] != -1) {
                q.add(new int[] { x, y });
              }
            }
          }
          int diffusion_side = q.size();
          while (!q.isEmpty()) {
            int[] side = q.poll();
            temp[side[0]][side[1]] += (arr[i][j] / 5);
          }
          arr[i][j] -= (arr[i][j] / 5) * (diffusion_side);
        }
      }
    }
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        arr[i][j] += temp[i][j];
      }
    }
  }

  public static void clean_upside() {
    for (int i = air_purifier_up - 1; i > 0; i--) {
      arr[i][0] = arr[i - 1][0];
    }
    for (int i = 0; i < C - 1; i++) {
      arr[0][i] = arr[0][i + 1];
    }
    for (int i = 0; i < air_purifier_up; i++) {
      arr[i][C - 1] = arr[i + 1][C - 1];
    }
    for (int i = C - 1; i > 1; i--) {
      arr[air_purifier_up][i] = arr[air_purifier_up][i - 1];
    }
    arr[air_purifier_up][1] = 0;
  }

  public static void clean_downside() {
    for (int i = air_purifier_down + 1; i < R - 1; i++) {
      arr[i][0] = arr[i + 1][0];
    }
    for (int i = 0; i < C - 1; i++) {
      arr[R - 1][i] = arr[R - 1][i + 1];
    }
    for (int i = R - 1; i > air_purifier_down; i--) {
      arr[i][C - 1] = arr[i - 1][C - 1];
    }
    for (int i = C - 1; i > 1; i--) {
      arr[air_purifier_down][i] = arr[air_purifier_down][i - 1];
    }
    arr[air_purifier_down][1] = 0;
  }

  public static int get_dust() {
    int sum = 2;
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        sum += arr[i][j];
      }
    }
    return sum;
  }
}