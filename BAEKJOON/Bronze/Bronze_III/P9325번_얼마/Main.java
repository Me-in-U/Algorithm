package BAEKJOON.Bronze.Bronze_III.P9325번_얼마;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int total = Integer.parseInt(br.readLine()); // S
      int N = Integer.parseInt(br.readLine());
      for (int j = 0; j < N; j++) {
        st = new StringTokenizer(br.readLine());
        total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
      }
      sb.append(total).append('\n');
    }
    System.out.print(sb.toString());
  }
}