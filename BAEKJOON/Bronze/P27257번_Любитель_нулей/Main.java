package BAEKJOON.Bronze.P27257번_Любитель_нулей;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    while (n % 10 == 0) {
      n /= 10;
    }
    while (n > 0) {
      if (n % 10 == 0) {
        count++;
      }
      n /= 10;
    }
    System.out.println(count);
  }
}