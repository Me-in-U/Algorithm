package BAEKJOON.Silver.Silver_III.P28138번_재밌는_나머지_연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    long N = Long.parseLong(input[0]);
    long R = Long.parseLong(input[1]);
    long sum = 0;
    for (long m = 1; m <= N; m++) {
      if (N % m == R) {
        sum += m;
      }
    }
    System.out.println(sum);
  }
}