package BAEKJOON.Bronze.Bronze_II.p5585번_거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int remains = 1000 - N;
    int[] coins = { 500, 100, 50, 10, 5, 1 };
    int count = 0;
    for (int i = 0; i < 6; i++) {
      if (remains != 0) {
        int coin_count = remains / coins[i];
        remains -= coins[i] * (coin_count);
        count += coin_count;
      }
    }
    System.out.println(count);
  }
}