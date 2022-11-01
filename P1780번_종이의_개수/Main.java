package P1780번_종이의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int[][] arr;
  public static int[] result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    result = new int[3];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    if (N == 1) {
      result[arr[0][0] + 1]++;
    } else {
      solve(0, 0, N);
    }
    System.out.println(result[0] + "\n" + result[1] + "\n" + result[2]);
  }

  public static void solve(int x, int y, int size) {
    if (size == 1) {
      for (int i = x; i < x + 3; i++) {
        for (int j = y; j < y + 3; j++) {
          result[arr[i][j] + 1]++;
        }
      }
    } else {
      int value = 0;
      boolean same = false;
      for (int i = x; i < N; i += size) {
        for (int j = y; j < N; j += size) {
          value = arr[i][j];
          same = same_numbox_check(i, j, size, value);
          if (!same) {
            solve(i, j, size / 3);
          } else {
            result[value + 1]++;
          }
        }
      }
    }
  }

  public static boolean same_numbox_check(int x, int y, int size, int value) {
    for (int i = x; i < x + size; i++) {
      for (int j = y; j < y + size; j++) {
        if (arr[i][j] != value) {
          return false;
        }
      }
    }
    return true;
  }
}