package BAEKJOON.Bronze.Bronze_III.P10162번_전자레인지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    if (T % 10 != 0) {
      System.out.println("-1");
    } else {
      int A = 0;
      int B = 0;
      int C = 0;
      A = T / 300;
      T = T % 300;
      B = T / 60;
      T = T % 60;
      C = T / 10;
      System.out.print(A + " " + B + " " + C);
    }
  }
}
