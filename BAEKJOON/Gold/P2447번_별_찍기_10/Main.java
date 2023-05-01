package P2447번_별_찍기_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  static char[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // 입력
    int N = Integer.parseInt(br.readLine());
    // 계산
    arr = new char[N][N];
    star(0, 0, N, false);
    // 출력
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(arr[i][j]);
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }

  static void star(int x, int y, int N, boolean blank) {
    // 공백칸일 경우
    // x ~ x + size(N)
    // y ~ y + size(N) 구간 빈칸으로 채움
    if (blank) {
      for (int i = x; i < x + N; i++) {
        for (int j = y; j < y + N; j++) {
          arr[i][j] = ' ';
        }
      }
      return;
    }
    // 공백칸이 아니고
    // 더이상 쪼갤 수 없는 블록일 때 ==> size(N) == 1일때 *로 채움
    if (N == 1) {
      arr[x][y] = '*';
      return;
    }
    // 3분할
    int size = N / 3;
    int count = 0;
    for (int i = x; i < x + N; i += size) {
      for (int j = y; j < y + N; j += size) {
        count++;
        // 구간별 5번째 칸은 공백칸
        if (count == 5) {
          star(i, j, size, true);
        } else {
          star(i, j, size, false);
        }
      }
    }
  }
}