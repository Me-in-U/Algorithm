package BAEKJOON.Bronze.Bronze_IV.P9782번_Median;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    for (int i = 1;; i++) {
      String line = br.readLine();
      if (line.equals("0")) {
        break;
      }
      double[] input = Arrays.stream(line.split(" ")).mapToDouble(Double::parseDouble).toArray();
      int n = (int) input[0];
      double median = n % 2 == 0 ? (input[n / 2] + input[(n / 2) + 1]) / 2
          : input[(n + 1) / 2];
      sb.append("Case ").append(i).append(": ").append(median).append('\n');
    }
    System.out.print(sb.toString());
  }
}