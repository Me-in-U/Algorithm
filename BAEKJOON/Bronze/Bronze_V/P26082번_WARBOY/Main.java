package BAEKJOON.Bronze.Bronze_V.P26082번_WARBOY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);
    int C = Integer.parseInt(input[2]);
    System.out.println((B / A) * C * 3);
  }
}