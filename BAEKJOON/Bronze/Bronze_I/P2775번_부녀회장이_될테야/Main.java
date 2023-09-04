package Bronze_I.P2775번_부녀회장이_될테야;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int a = 0; a < T; a++) {
      int k = sc.nextInt();
      int n = sc.nextInt();
      int p[][] = new int[k + 1][n + 1];
      for (int b_1 = 0; b_1 <= k; b_1++) {
        p[b_1][0] = 1;
      }
      for (int b_2 = 0; b_2 < n; b_2++) {
        p[0][b_2] = b_2 + 1;
      }
      for (int c = 1; c <= k; c++) {
        for (int d = 1; d < n; d++) {
          p[c][d] = p[c][d - 1] + p[c - 1][d];
        }
      }
      System.out.println(p[k][n - 1]);
    }
    sc.close();
  }
}