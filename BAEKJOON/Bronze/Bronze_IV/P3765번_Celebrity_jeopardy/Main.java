package BAEKJOON.Bronze.Bronze_IV.P3765번_Celebrity_jeopardy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static String input;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while ((input = br.readLine()) != null) {
      sb.append(input).append("\n");
    }
    System.out.print(sb.toString());
  }
}