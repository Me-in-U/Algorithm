package P1987번_알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static char[][] data;
  protected static int R;
  protected static int C;
  protected static boolean[] alphabet;
  protected static int max = 1;
  protected static int[] moveX = { 0, 0, -1, 1 };
  protected static int[] moveY = { -1, 1, 0, 0 };

  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    R = Integer.parseInt(input[0]);
    C = Integer.parseInt(input[1]);
    data = new char[R][C];
    alphabet = new boolean[26];
    for (int i = 0; i < R; i++) {
      System.arraycopy(br.readLine().toCharArray(), 0, data[i], 0, C);
    }
    // !dfs
    dfs(0, 0, 1);
    // !출력
    System.out.println(max);
  }

  public static void dfs(int x, int y, int depth) {
    alphabet[data[x][y] - 'A'] = true;
    for (int i = 0; i < 4; i++) {
      int nextX = x + moveX[i];
      int nextY = y + moveY[i];
      if (0 <= nextX && 0 <= nextY && nextX < R && nextY < C)
        if (!alphabet[data[nextX][nextY] - 'A']) {
          max = Math.max(depth + 1, max);
          dfs(nextX, nextY, depth + 1);
        }
    }
    alphabet[data[x][y] - 'A'] = false;
  }
}
