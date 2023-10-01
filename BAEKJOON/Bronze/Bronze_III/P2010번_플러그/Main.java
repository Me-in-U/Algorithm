package BAEKJOON.Bronze.Bronze_III.P2010번_플러그;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
      count += Integer.parseInt(br.readLine());
    }
    System.out.println(count - N +1);
  }
}