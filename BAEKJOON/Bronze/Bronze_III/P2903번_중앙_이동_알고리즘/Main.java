package BAEKJOON.Bronze.Bronze_III.P2903번_중앙_이동_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dot = 2;
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      dot += dot - 1;
    }
    System.out.println(dot * dot);
  }
}