package BAEKJOON.Bronze.Bronze_IV.P28224번_Final_Price;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    while (n-- > 0) {
      sum += Integer.parseInt(br.readLine());
    }
    System.out.println(sum);
  }
}