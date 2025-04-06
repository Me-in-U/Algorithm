package BAEKJOON.Bronze.Bronze_III.P2576번_홀수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int min = 100;
    int odd_sum = 0;
    for (int i = 0; i < 7; i++) {
      int input = Integer.parseInt(br.readLine());
      if (input % 2 != 0) {
        if (min > input) {
          min = input;
        }
        odd_sum += input;
      }
    }
    if (odd_sum == 0) {
      System.out.println("-1");
    } else {
      System.out.println(odd_sum);
      System.out.println(min);
    }
  }
}