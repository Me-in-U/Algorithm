package BAEKJOON.Bronze.Bronze_III.P5613번_계산기_프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = Integer.parseInt(br.readLine());
    char c = ' ';
    while ((c = br.readLine().charAt(0)) != '=') {
      if (c == '+') {
        result += Integer.parseInt(br.readLine());
      } else if (c == '-') {
        result -= Integer.parseInt(br.readLine());
      } else if (c == '*') {
        result *= Integer.parseInt(br.readLine());
      } else if (c == '/') {
        result /= Integer.parseInt(br.readLine());
      }
    }
    System.out.println(result);
  }
}