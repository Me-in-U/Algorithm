package BAEKJOON.Bronze.Bronze_IV.P19602번_Dog_Treats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    if (1 * Integer.parseInt(br.readLine()) + 2 * Integer.parseInt(br.readLine())
        + 3 * Integer.parseInt(br.readLine()) >= 10)
      System.out.println("happy");
    else
      System.out.println("sad");
  }
}