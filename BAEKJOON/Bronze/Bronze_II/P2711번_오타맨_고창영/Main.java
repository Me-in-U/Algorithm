package BAEKJOON.Bronze.Bronze_II.P2711번_오타맨_고창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int miss = Integer.parseInt(st.nextToken());
      char[] input = st.nextToken().toCharArray();
      for (int j = 1; j <= input.length; j++) {
        if (j != miss) {
          sb.append(input[j - 1]);
        }
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}