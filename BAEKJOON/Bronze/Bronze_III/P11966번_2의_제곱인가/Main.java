package BAEKJOON.Bronze.Bronze_III.P11966번_2의_제곱인가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long input = Long.parseLong(br.readLine());
    for (int i = 0; i <= 30; i++) {
      long data = (long) Math.pow(2, i);
      if (input == data) {
        System.out.println(1);
        return;
      } else if (input < data) {
        break;
      }
    }
    System.out.println(0);
  }
}