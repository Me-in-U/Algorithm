package BAEKJOON.Silver.Silver_IV.P1065번_한수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int sum = 99;
    if (N < 100)
      sum = N;
    for (int i = 100; i <= N; i++) {
      String num = String.valueOf(i);
      if (num.charAt(0) - num.charAt(1) == num.charAt(1) - num.charAt(2)) {
        sum++;
      }
    }
    System.out.println(sum);
  }
}