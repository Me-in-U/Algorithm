package BAEKJOON.Bronze.Bronze_IV.P5524번_입실_관리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      sb.append(br.readLine().toLowerCase()).append('\n');
    }
    System.out.print(sb);
  }
}