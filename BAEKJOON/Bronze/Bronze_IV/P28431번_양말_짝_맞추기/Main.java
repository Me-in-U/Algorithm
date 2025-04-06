package BAEKJOON.Bronze.Bronze_IV.P28431번_양말_짝_맞추기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] s = new int[10];
    for (int i = 0; i < 5; i++) {
      s[Integer.parseInt(br.readLine())]++;
    }
    for (int i = 0; i < 10; i++) {
      if (s[i] % 2 == 1) {
        System.out.println(i);
        break;
      }
    }
  }
}
