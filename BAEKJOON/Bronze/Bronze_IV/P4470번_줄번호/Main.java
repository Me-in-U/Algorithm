package BAEKJOON.Bronze.Bronze_IV.P4470번_줄번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      sb.append(i + ". " + br.readLine()).append('\n');
    }
    System.out.print(sb.toString());
  }
}