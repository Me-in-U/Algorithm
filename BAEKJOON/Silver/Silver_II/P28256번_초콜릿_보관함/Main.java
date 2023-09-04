package BAEKJOON.Silver.P28256번_초콜릿_보관함;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Main {
  protected static boolean[][] chocolateCase;
  protected static boolean[][] visited;
  protected static List<Integer> result;
  protected static int[] moveX = { 0, 0, 1, -1 };
  protected static int[] moveY = { 1, -1, 0, 0 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      chocolateCase = new boolean[3][3];
      visited = new boolean[3][3];
      for (int j = 0; j < 3; j++) {
        String data = br.readLine();
        for (int k = 0; k < 3; k++) {
          if (data.charAt(k) == 'O') {
            chocolateCase[j][k] = true;
          }
        }
      }
      String[] input = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]);
      result = new ArrayList<>();
      bfs();
      if (n != result.size()) {
        sb.append(0).append('\n');
      } else {
        Collections.sort(result);
        boolean same = true;
        for (int j = 0; j < n; j++) {
          if (result.get(j) != Integer.parseInt(input[j + 1])) {
            same = false;
            break;
          }
        }
        if (same) {
          sb.append(1).append('\n');
        } else {
          sb.append(0).append('\n');
        }
      }
    }
    System.out.print(sb.toString());
  }

  public static void bfs() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (chocolateCase[i][j] && !visited[i][j]) {
          Deque<int[]> dq = new ArrayDeque<>();
          dq.add(new int[] { i, j });
          visited[i][j] = true;
          int count = 1;
          while (!dq.isEmpty()) {
            int[] pos = dq.poll();
            int x = pos[0];
            int y = pos[1];
            for (int k = 0; k < 4; k++) {
              int nextX = x + moveX[k];
              int nextY = y + moveY[k];
              if (0 <= nextX && 0 <= nextY && nextX < 3 && nextY < 3) {
                if (chocolateCase[nextX][nextY] && !visited[nextX][nextY]) {
                  dq.add(new int[] { nextX, nextY });
                  visited[nextX][nextY] = true;
                  count++;
                }
              }
            }
          }
          result.add(count);
        }
      }
    }
  }
}