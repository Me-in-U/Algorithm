package BAEKJOON.Bronze.Bronze_V.P10872번_팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int result = 1;
    for (int i = 2; i <= N; i++)
      result *= i;
    System.out.println(result);
  }
}