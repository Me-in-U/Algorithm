package P1389번_케빈_베이컨의_6단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static boolean[][] connection;
  static int[] result;
  static int[][] min_count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // 입력
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    result = new int[N];
    min_count = new int[N][N];
    connection = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      Arrays.fill(min_count[i], 100);
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      connection[x - 1][y - 1] = true;
      connection[y - 1][x - 1] = true;
    }

    // 계산
    for (int i = 0; i < N; i++) {
      min_count[i][i] = 0;
      dfs(i, i, 1);
      int sum = 0;
      for (int j = 0; j < N; j++) {
        // System.out.print(min_count[i][j] + " ");
        sum += min_count[i][j];
      }
      // System.out.println();
      result[i] = sum;
    }

    // 출력
    int min = 100;
    int min_person = -1;
    for (int i = 0; i < N; i++) {
      if (min > result[i]) {
        min = result[i];
        min_person = i + 1;
      }
    }
    System.out.println(min_person);
  }

  public static void dfs(int now, int start, int depth) {
    for (int i = 0; i < N; i++) {
      // System.out.println("not" + "[" + start + "][" + i + "]" + "depth = " +
      // depth);
      if (connection[start][i] && min_count[now][i] > depth) {
        // System.out.println(now + "의 " + "[" + i + "번째]" + "depth = " + depth);
        min_count[now][i] = depth;
        // System.out.println();
        dfs(now, i, depth + 1);
      }
    }
    // System.out.println();
  }
}