package BAEKJOON.Bronze.Bronze_III.P18883번_N_M_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int num = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(++num);
        if (j != M - 1) {
          sb.append(" ");
        }
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}