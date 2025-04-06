package BAEKJOON.Bronze.Bronze_II.P1212번_8진수_2진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String input = br.readLine();

    for (int i = 0; i < input.length(); i++) {
      int num = input.charAt(i) - '0';
      if (i != 0 && num <= 1)
        sb.append("00");
      else if (i != 0 && (num == 2 || num == 3))
        sb.append("0");
      sb.append(Integer.toBinaryString(num));
    }
    System.out.println(sb);
  }
}