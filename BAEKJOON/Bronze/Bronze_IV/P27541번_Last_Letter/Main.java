package BAEKJOON.Bronze.Bronze_IV.P27541번_Last_Letter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String S = br.readLine();
    if (S.charAt(N - 1) == 'G') {
      System.out.println(S.substring(0, N - 1));
    } else {
      System.out.print(S);
      System.out.println("G");
    }
  }
}