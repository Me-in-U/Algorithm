package BAEKJOON.Bronze.Bronze_IV.P14065번_Gorivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.printf("%.6f", 100.0 / ((1.609344 / 3.785411784) * Double.parseDouble(br.readLine())));
  }
}