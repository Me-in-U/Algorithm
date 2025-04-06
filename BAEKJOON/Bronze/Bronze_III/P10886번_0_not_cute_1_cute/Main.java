package BAEKJOON.Bronze.Bronze_III.P10886번_0_not_cute_1_cute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] data = new int[2];
    for (int i = 0; i < N; i++) {
      data[Integer.parseInt(br.readLine())]++;
    }
    if (data[0] > data[1]) {
      System.out.println("Junhee is not cute!");
    } else {
      System.out.println("Junhee is cute!");
    }
  }
}
