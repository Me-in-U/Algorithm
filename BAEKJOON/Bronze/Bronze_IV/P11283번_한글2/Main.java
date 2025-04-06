package BAEKJOON.Bronze.Bronze_IV.P11283번_한글2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char hangul = br.readLine().charAt(0);
    System.out.println((int) hangul - 44031);
  }
}
