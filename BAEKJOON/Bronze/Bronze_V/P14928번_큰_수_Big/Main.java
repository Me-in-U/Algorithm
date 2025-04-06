package BAEKJOON.Bronze.Bronze_V.P14928번_큰_수_Big;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int divider = 20000303;
    int result = 0;
    for (int i = 0; i < input.length(); i++) {
      result = (result * 10 + (input.charAt(i) - '0')) % divider;
    }

    System.out.println(result);
  }
}