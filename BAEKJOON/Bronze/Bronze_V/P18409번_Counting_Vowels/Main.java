package BAEKJOON.Bronze.Bronze_V.P18409번_Counting_Vowels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String S = br.readLine();
    int count = 0;
    for (int i = 0; i < N; i++) {
      char c = S.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }
    System.out.println(count);
  }
}