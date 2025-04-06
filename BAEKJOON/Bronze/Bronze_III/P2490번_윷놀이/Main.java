package BAEKJOON.Bronze.Bronze_III.P2490번_윷놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    String[] cases = { "E", "A", "B", "C", "D" };
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      int count = 0;
      for (int j = 0; j < 4; j++) {
        if (st.nextToken().equals("0")) {
          count++;
        }
      }
      sb.append(cases[count]).append('\n');
    }
    System.out.print(sb.toString());
  }
}