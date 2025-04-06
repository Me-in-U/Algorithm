package BAEKJOON.Bronze.Bronze_V.P30007번_라면_공식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int X = Integer.parseInt(st.nextToken());
      int W = A * (X - 1) + B;
      sb.append(W).append("\n");
    }
    System.out.print(sb.toString());
  }
}