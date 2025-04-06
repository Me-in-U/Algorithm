package BAEKJOON.Bronze.Bronze_IV.P24751번_Betting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    System.out.println(100.0 / a);
    System.out.println(100.0 / (100 - a));
  }
}