package BAEKJOON.Bronze.Bronze_V.P27433번_팩토리얼_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    long fac = 1;
    for (int i = 1; i <= x; i++) {
      fac *= i;
    }
    System.out.println(fac);
  }
}