package P9455번_박스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int m = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());
      boolean[][] boxes = new boolean[m][n];
      for (int j = 0; j < m; j++) {
        st = new StringTokenizer(br.readLine());
        for (int k = 0; k < n; k++) {
          if (Integer.parseInt(st.nextToken()) == 1) {
            boxes[j][k] = true;
          }
        }
      }
      int[] idleMoves = new int[m + 1];
      idleMoves[1] = m;
      for (int pos = 2, k = m - 1; k > 0; k--, pos++) {
        idleMoves[pos] = idleMoves[pos - 1] + k;
      }
      int totalMoves = 0;
      for (int j = 0; j < n; j++) {
        int colSum = 0;
        int colBoxCount = 0;
        for (int k = 0; k < m; k++) {
          if (boxes[k][j]) {
            colSum += k + 1;
            colBoxCount++;
          }
        }
        totalMoves += (idleMoves[colBoxCount] - colSum);
      }
      sb.append(totalMoves).append('\n');
    }
    System.out.print(sb.toString());
  }
}