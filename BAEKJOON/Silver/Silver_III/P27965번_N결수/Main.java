package BAEKJOON.Silver.Silver_III.P27965번_N결수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    long result = 0;
    for (int i = 1; i <= N; i++) {
      result = (result * (int) Math.pow(10, (int) Math.log10(i) + 1) + i) % K;
    }
    System.out.println(result);
  }
}
