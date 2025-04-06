package BAEKJOON.Bronze.Bronze_IV.P13623번_Zero_or_One;

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
    if (A == B && A == C)
      System.out.println("*");
    else if (A != B && A != C && B == C)
      System.out.println("A");
    else if (A != B && A == C && B != C)
      System.out.println("B");
    else
      System.out.println("C");
  }
}