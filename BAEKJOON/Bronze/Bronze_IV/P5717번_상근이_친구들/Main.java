package BAEKJOON.Bronze.Bronze_IV.P5717번_상근이_친구들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    while (true) {
      st = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(st.nextToken());
      int F = Integer.parseInt(st.nextToken());
      if (M == 0 && F == 0) {
        break;
      }
      sb.append((M + F)).append('\n');
    }
    System.out.print(sb.toString());
  }
}