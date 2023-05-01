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

    // 입력
    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    result = new int[3];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 계산
    solve(0, 0, N);
    // 출력
    System.out.println(result[0] + "\n" + result[1] + "\n" + result[2]);
  }

  /*
   * x, y, size를 받고 해당 구간이 모두 같은 수 인지 확인 => same_numbox_check(x, y, size, value)
   * 모두 같은 수로 돼있으면 결과값 증가
   * 하나라도 다를 경우 해당 구간을 x, y 모두 3등분 하여 재귀 반복
   */
  public static void solve(int x, int y, int size) {
    int value = arr[x][y];
    boolean same = same_numbox_check(x, y, size, value);
    if (same) {
      result[value + 1]++;
    } else {
      for (int i = x; i < x + size; i += (size / 3)) {
        for (int j = y; j < y + size; j += (size / 3)) {
          solve(i, j, size / 3);
        }
      }
    }
  }

  /*
   * x ~ x + size, y ~ y + size 구간을 돌면서 value와 다른 값이 있으면 return false
   */
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