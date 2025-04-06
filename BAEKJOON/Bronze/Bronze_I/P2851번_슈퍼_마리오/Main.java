package BAEKJOON.Bronze.Bronze_I.P2851번_슈퍼_마리오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int before_100 = 0;
    int after_100 = -1;
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      sum += Integer.parseInt(br.readLine());
      if (sum < 100) {
        before_100 = sum;
      } else if (sum >= 100 && after_100 == -1) {
        after_100 = sum;
      }
    }
    if (after_100 == -1) {
      System.out.println(before_100);
    } else {
      if ((100 - before_100) < after_100 - 100) {
        System.out.println(before_100);
      } else {
        System.out.println(after_100);
      }
    }

  }
}