package BAEKJOON.Bronze.Bronze_V.P26575번_Pups;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      double d = Double.parseDouble(input[0]);
      double f = Double.parseDouble(input[1]);
      double p = Double.parseDouble(input[2]);
      sb.append(String.format("$%.2f", d * f * p)).append('\n');
    }
    System.out.print(sb.toString());
  }
}