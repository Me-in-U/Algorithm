package BAEKJOON.Bronze.Bronze_V.P28701번_세제곱의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println(sum * sum);
    System.out.println(sum * sum);
  }
}