package BAEKJOON.Silver.Silver_I.P16926번_배열_돌리기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int[][] inputArr;
  private static int[][] outputArr;
  private static int N, M, R;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    inputArr = new int[N][M];
    outputArr = new int[N][M];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        inputArr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for (int i = 0; i < Math.min(N, M) / 2; i++) {
      rotate_clock(i);
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(outputArr[i][j]).append(" ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }

  public static void rotate_clock(int i) {
    int n = i;
    int m = i;
    int r = 0;
    while (r != R) {
      if (n == i && m < M - 1 - i) {
        m++;
      } else if (m == M - 1 - i && n < N - 1 - i) {
        n++;
      } else if (n == N - 1 - i && m > i) {
        m--;
      } else if (m == i && n > i) {
        n--;
      }
      r++;
    }
    rotate_counter_clock(i, n, m);
  }

  public static void rotate_counter_clock(int i, int n, int m) {
    int output_N = i;
    int output_M = i;
    while (true) {
      outputArr[output_N][output_M] = inputArr[n][m];
      if (m == i && n < N - 1 - i) {
        n++;
      } else if (n == N - 1 - i && m != M - 1 - i) {
        m++;
      } else if (m == M - 1 - i && n > i) {
        n--;
      } else if (n == i && m > i) {
        m--;
      }
      if (output_M == i && output_N < N - 1 - i) {
        output_N++;
      } else if (output_N == N - 1 - i && output_M != M - 1 - i) {
        output_M++;
      } else if (output_M == M - 1 - i && output_N > i) {
        output_N--;
      } else if (output_N == i && output_M > i) {
        output_M--;
      }
      if (output_N == i && output_M == i) {
        break;
      }
    }
  }
}