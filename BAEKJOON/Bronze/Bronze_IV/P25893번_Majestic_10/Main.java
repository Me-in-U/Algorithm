package BAEKJOON.Bronze.Bronze_IV.P25893번_Majestic_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] print = { "zilch", "double", "double-double", "triple-double" };
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    while (n-- > 0) {
      String line = br.readLine();
      int count = (int) Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).filter(a -> a >= 10).count();
      sb.append(line).append('\n').append(print[count]).append("\n\n");
    }
    System.out.print(sb.toString().trim());
  }
}