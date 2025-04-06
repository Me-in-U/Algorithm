package BAEKJOON.Bronze.Bronze_IV.P28295번_체육은_코딩과목_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dir = 0;
    char[] out = { 'N', 'E', 'S', 'W' };
    for (int i = 0; i < 10; i++) {
      dir += Integer.parseInt(br.readLine());
    }
    System.out.println(out[dir % 4]);
  }
}
