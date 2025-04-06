package BAEKJOON.Bronze.Bronze_III.P2566번_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = -1;
    int x = 0;
    int y = 0;
    StringTokenizer st = null;
    for (int i = 1; i <= 9; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= 9; j++) {
        int k = Integer.parseInt(st.nextToken());
        if (k >= max) {
          max = k;
          x = i;
          y = j;
        }
      }

    }
    System.out.println(max);
    System.out.println(x + " " + y);
  }
}