package BAEKJOON.Bronze.Bronze_IV.P28352번_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long N = Long.parseLong(br.readLine());
    for (int i = 1, R = (int) N; i < R; i++) {
      N *= i;
    }
    System.out.println(N / 604800);
  }
}