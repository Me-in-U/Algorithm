package BAEKJOON.Bronze.Bronze_IV.P26531번_Simple_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    if (a.charAt(0) + a.charAt(4) - '0' == a.charAt(8)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}