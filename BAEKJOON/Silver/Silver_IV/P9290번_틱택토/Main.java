package BAEKJOON.Silver.Silver_IV.P9290번_틱택토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static char[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      arr = new char[3][3];
      for (int k = 0; k < 3; k++) {
        String str = br.readLine();
        for (int j = 0; j < 3; j++) {
          arr[k][j] = str.charAt(j);
        }
      }
      solve(br.readLine());
      sb.append("Case " + (i + 1) + ":").append('\n');
      for (int k = 0; k < 3; k++) {
        for (int j = 0; j < 3; j++) {
          sb.append(arr[k][j]);
        }
        sb.append('\n');
      }
    }
    System.out.print(sb);
  }

  public static void solve(String dol) {
    char a = dol.charAt(0);

    for (int i = 0; i < 3; i++) {
      // 왼쪽 2개
      if (arr[i][0] == a && arr[i][1] == a) {
        arr[i][2] = a;
      }
      // 윗쪽 2개
      if (arr[0][i] == a && arr[1][i] == a) {
        arr[2][i] = a;
      }
      // o-o가로
      if (arr[i][0] == a && arr[i][2] == a) {
        arr[i][1] = a;
      }
      // o-o세로
      if (arr[0][i] == a && arr[2][i] == a) {
        arr[1][i] = a;
      }
    }

    for (int i = 2; i >= 0; i--) {
      // 오른쪽 2개
      if (arr[i][1] == a && arr[i][2] == a) {
        arr[i][0] = a;
      }
      // 아랫쪽 2개
      if (arr[1][i] == a && arr[2][i] == a) {
        arr[0][i] = a;
      }
    }

    // 중간이 찬 대각선
    if (arr[1][1] == a) {
      if (arr[0][0] == a) {
        arr[2][2] = a;
      } else if (arr[0][2] == a) {
        arr[2][0] = a;
      } else if (arr[2][0] == a) {
        arr[0][2] = a;
      } else if (arr[2][2] == a) {
        arr[0][0] = a;
      }
    }
    // 중간이 빈 대각선
    if ((arr[1][1] == '-') && (arr[0][0] == a && arr[2][2] == a || arr[0][2] == a && arr[2][0] == a)) {
      arr[1][1] = a;
    }
  }
}
