package P1992번_쿼드트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static boolean[][] arr;
  public static int N;
  public static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    sb = new StringBuilder();

    // 입력
    N = Integer.parseInt(br.readLine());
    arr = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      for (int j = 0; j < N; j++) {
        if (input.charAt(j) == '0') {
          arr[i][j] = false;
        } else {
          arr[i][j] = true;
        }
      }
    }
    // 계산
    solve(0, 0, N);
    // 출력
    System.out.println(sb.toString());
  }

  public static void solve(int x, int y, int size) {
    if (same_numbox_check(x, y, size, arr[x][y])) {
      if (arr[x][y]) {
        sb.append("1");
      } else {
        sb.append("0");
      }
    } else {
      sb.append("(");
      for (int i = x; i < x + size; i += (size / 2)) {
        for (int j = y; j < y + size; j += (size / 2)) {
          solve(i, j, size / 2);
        }
      }
      sb.append(")");
    }
  }

  public static boolean same_numbox_check(int x, int y, int size, boolean firstPoint) {
    for (int i = x; i < x + size; i++) {
      for (int j = y; j < y + size; j++) {
        if (arr[i][j] != firstPoint) {
          return false;
        }
      }
    }
    return true;
  }
}