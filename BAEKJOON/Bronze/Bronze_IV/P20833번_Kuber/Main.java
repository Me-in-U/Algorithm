package BAEKJOON.Bronze.Bronze_IV.P20833번_Kuber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      sum += Math.pow(i, 3);
    }
    System.out.println(sum);
  }
}