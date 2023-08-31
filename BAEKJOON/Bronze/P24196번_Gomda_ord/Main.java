package BAEKJOON.Bronze.P24196번_Gomda_ord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0, c; i < input.length(); i += c - 'A' + 1) {
      c = input.charAt(i);
      sb.append((char) c);
    }
    System.out.print(sb.toString());
  }
}