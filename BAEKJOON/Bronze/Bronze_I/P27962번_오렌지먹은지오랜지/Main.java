package BAEKJOON.Bronze.Bronze_I.P27962번_오렌지먹은지오랜지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    boolean found = false;
    for (int i = 1; i <= N; i++) {
      String front = str.substring(0, i);
      String back = str.substring(N - i, N);
      int count = 0;
      for (int j = 0; j < i; j++) {
        if (front.charAt(j) != back.charAt(j)) {
          count++;
        }
      }
      if (count == 1) {
        found = true;
        break;
      }
    }
    if (found)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}