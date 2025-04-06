package BAEKJOON.Bronze.Bronze_I.P11179번_2진수_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strBinary_N = Integer.toBinaryString(Integer.parseInt(br.readLine()));
    StringBuilder sb = new StringBuilder();
    for (int i = strBinary_N.length() - 1; i >= 0; i--)
      sb.append(strBinary_N.charAt(i));
    System.out.println(Integer.parseInt(sb.toString(), 2));
  }
}