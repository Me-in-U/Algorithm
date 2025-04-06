package BAEKJOON.Bronze.Bronze_IV.P27239번_Шахматная_доска;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int num = 0;
    int eng = 0;
    for (int i = 1; i <= 8 && num == 0; i++) {
      for (int j = 1; j <= 8; j++) {
        int a = 1 + ((i - 1) * 8) + (j - 1);
        if (a == n) {
          num = i;
          eng = j;
          break;
        }
      }
    }
    System.out.print((char) ('a' + eng - 1));
    System.out.println(num);
  }
}