package BAEKJOON.Bronze.Bronze_IV.P13136번_Do_Not_Touch_Anything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    long R = Integer.parseInt(input[0]);
    long C = Integer.parseInt(input[1]);
    long N = Integer.parseInt(input[2]);
    if (R % N == 0)
      R /= N;
    else
      R = R / N + 1;
    if (C % N == 0)
      C /= N;
    else
      C = C / N + 1;
    long result = R * C;
    System.out.println(result);
  }
}