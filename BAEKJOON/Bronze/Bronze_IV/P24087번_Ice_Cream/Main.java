package BAEKJOON.Bronze.Bronze_IV.P24087번_Ice_Cream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float S = Integer.parseInt(br.readLine());
    float A = Integer.parseInt(br.readLine());
    float B = Integer.parseInt(br.readLine());
    if (S <= A)
      System.out.println(250);
    else
      System.out.println((int) (250 + 100 * Math.ceil((S - A) / B)));
  }
}