package BAEKJOON.Unrated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] s = new int[10];
    for (int i = 0; i < 10; i++) {
      s[Integer.parseInt(br.readLine())]++;
    }
    for (int i = 0; i < 10; i++) {
      if (s[i] != 2) {
        System.out.println(i);
        break;
      }
    }
  }
}