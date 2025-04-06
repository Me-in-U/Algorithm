package BAEKJOON.Bronze.Bronze_IV.P16204번_카드_뽑기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);
    int K = Integer.parseInt(input[2]);
    System.out.println((Math.min(M, K) + Math.min(N - M, N - K)));
  }
}