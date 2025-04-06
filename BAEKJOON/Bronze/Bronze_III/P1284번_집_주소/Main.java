package BAEKJOON.Bronze.Bronze_III.P1284번_집_주소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    StringBuilder sb = new StringBuilder();
    int[] value = { 4, 2, 3, 3, 3, 3, 3, 3, 3, 3 };
    while (!(input = br.readLine()).equals("0")) {
      int[] numberCount = new int[10];
      for (int i = 0; i < input.length(); i++) {
        numberCount[input.charAt(i) - '0']++;
      }
      int result = input.length() + 1;
      for (int i = 0; i < 10; i++) {
        result += numberCount[i] * value[i];
      }
      sb.append(result).append('\n');
    }
    System.out.print(sb.toString());
  }
}