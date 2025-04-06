package BAEKJOON.Silver.Silver_III.P1783번_병든나이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int M;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    System.out.print(solve());
  }

  public static int solve() {
    if (N == 1) {
      return 1;
    } else if (N <= 2) {
      return Math.min(4, (M + 1) / 2);
    } else {
      if (M <= 6) {
        return Math.min(4, M);
      } else {
        return M - 2;
      }
    }
  }
}