package BAEKJOON.Bronze.Bronze_I.P27961번_고양이는_많을수록_좋다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long N = Long.parseLong(br.readLine());
    long meow = 0;
    long count = 0;
    while (meow != N) {
      meow = (long) Math.pow(2, count);
      count++;
      if (meow > N) {
        break;
      }
    }
    System.out.println(count);
  }
}
