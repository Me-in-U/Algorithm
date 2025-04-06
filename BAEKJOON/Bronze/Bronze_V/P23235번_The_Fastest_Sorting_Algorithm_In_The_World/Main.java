package BAEKJOON.Bronze.Bronze_V.P23235번_The_Fastest_Sorting_Algorithm_In_The_World;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    for (int i = 1;; i++) {
      String input = br.readLine();
      if (input.charAt(0) == '0') {
        break;
      }
      sb.append("Case " + i + ": Sorting... done!").append('\n');
    }
    System.out.print(sb.toString());
  }
}
