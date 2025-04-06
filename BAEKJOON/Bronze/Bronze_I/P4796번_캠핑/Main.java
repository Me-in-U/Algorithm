package BAEKJOON.Bronze.Bronze_I.P4796번_캠핑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    for (int i = 1;; i++) {
      st = new StringTokenizer(br.readLine());
      int L = Integer.parseInt(st.nextToken());
      int P = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      if (L == 0 && P == 0 && V == 0) {
        System.out.print(sb);
        break;
      }
      sb.append("Case " + i + ": " + (((V / P) * L) + Math.min(V % P, L))).append('\n');
    }
  }
}