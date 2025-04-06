package BAEKJOON.Bronze.Bronze_IV.P25858번_Divide_the_Cash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int d = Integer.parseInt(input[1]);
    int t = 0;
    int[] ps = new int[n];
    for (int i = 0; i < n; i++) {
      t += ps[i] = Integer.parseInt(br.readLine());
    }
    int s = d / t;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(s * ps[i]).append('\n');
    }
    System.out.print(sb.toString());
  }
}