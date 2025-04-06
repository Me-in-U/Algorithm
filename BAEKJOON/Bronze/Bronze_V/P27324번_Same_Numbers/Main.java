package BAEKJOON.Bronze.Bronze_V.P27324번_Same_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    if (N.charAt(0) == N.charAt(1)) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}