package BAEKJOON.Bronze.Bronze_IV.P26561번_Population;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      int p = Integer.parseInt(input[0]);
      int t = Integer.parseInt(input[1]);
      sb.append(p - (t / 7) + (t / 4)).append('\n');
    }
    System.out.print(sb.toString());
  }
}