package BAEKJOON.Bronze.Bronze_IV.P20352번_Circus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print(Math.sqrt(Long.parseLong(br.readLine()) / Math.PI) * 2 * Math.PI);
  }
}