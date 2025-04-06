package BAEKJOON.Bronze.Bronze_IV.P25640번_MBTI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String jinHo = br.readLine();
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (jinHo.equals(br.readLine())) {
        count++;
      }
    }
    System.out.println(count);
  }
}