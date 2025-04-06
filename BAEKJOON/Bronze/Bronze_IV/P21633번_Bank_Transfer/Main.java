package BAEKJOON.Bronze.Bronze_IV.P21633번_Bank_Transfer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double result = Integer.parseInt(br.readLine()) * 0.01 + 25;
    if (result < 100)
      System.out.printf("%.2f", 100.00);
    else if (result > 2000)
      System.out.printf("%.2f", 2000.00);
    else
      System.out.printf("%.2f", result);
  }
}