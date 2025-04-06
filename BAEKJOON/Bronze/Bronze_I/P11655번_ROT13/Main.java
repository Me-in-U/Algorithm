package BAEKJOON.Bronze.Bronze_I.P11655번_ROT13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] input = br.readLine().toCharArray();
    for (int i = 0; i < input.length; i++) {
      if ('a' <= input[i] && input[i] <= 'z') {
        int b = input[i] + 13;
        if (b > 122) {
          b -= 26;
        }
        input[i] = (char) b;
      } else if ('A' <= input[i] && input[i] <= 'Z') {
        int b = input[i] + 13;
        if (b > 90) {
          b -= 26;
        }
        input[i] = (char) b;
      }
    }
    for (int k = 0; k < input.length; k++) {
      sb.append(input[k]);
    }
    System.out.println(sb.toString());
  }
}