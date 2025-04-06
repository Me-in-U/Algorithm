package BAEKJOON.Bronze.Bronze_III.P28135번_Since_1973;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 1; i <= N; i++) {
      count++;
      if (i == N) {
        break;
      }
      String num = String.valueOf(i);
      for (int j = 0; j < num.length() - 1; j++) {
        if (num.substring(j, j + 2).equals("50")) {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}
