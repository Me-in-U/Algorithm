package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static boolean[][] arr;
  private static int min = Integer.MAX_VALUE;
  private static int N, count;
  private static int top = -1;
  private static int left = -1;
  private static int right = -1;
  private static int bottom = -1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    count = 0;
    N = Integer.parseInt(br.readLine());
    arr = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < N; j++) {
        if (line.charAt(j) == 'G') {
          arr[i][j] = true;
          count++;
        }
      }
    }
    if (count == 1) {
      System.out.println("0");
    } else {
      getMin();
      System.out.println(min);
    }
  }

  public static void getMin() {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (arr[i][j]) {
          top = i;
          break;
        }
      }
      if (top != -1) {
        break;
      }
    }
    for (int i = N - 1; i >= 0; i--) {
      for (int j = 0; j < N; j++) {
        if (arr[i][j]) {
          bottom = i;
          break;
        }
      }
      if (bottom != -1) {
        break;
      }
    }
    for (int j = 0; j < N; j++) {
      for (int i = 0; i < N; i++) {
        if (arr[i][j]) {
          left = j;
          break;
        }
      }
      if (left != -1) {
        break;
      }
    }
    for (int j = N - 1; j >= 0; j--) {
      for (int i = 0; i < N; i++) {
        if (arr[i][j]) {
          right = j;
          break;
        }
      }
      if (right != -1) {
        break;
      }
    }
    // System.out.println(top + " " + bottom + " " + left + " " + right);
    if (left == right) {
      min = Math.min(min, bottom); // 상
      min = Math.min(min, (N - 1 - top)); // 하
    } else if (top == bottom) {
      min = Math.min(min, (N - 1 - left)); // 좌
      min = Math.min(min, right); // 우
    } else {
      min = Math.min(min, bottom + right); // 좌상
      min = Math.min(min, bottom + (N - 1 - left)); // 우상
      min = Math.min(min, (N - 1 - top) + right); // 우하
      min = Math.min(min, (N - 1 - top) + (N - 1 - left)); // 좌하
    }
  }
}