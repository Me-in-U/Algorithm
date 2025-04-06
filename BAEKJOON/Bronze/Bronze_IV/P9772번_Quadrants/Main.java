package BAEKJOON.Bronze.Bronze_IV.P9772번_Quadrants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String[] xy = br.readLine().split(" ");
    while (!(Double.parseDouble(xy[0]) == 0 && Double.parseDouble(xy[1]) == 0)) {
      double x = Double.parseDouble(xy[0]);
      double y = Double.parseDouble(xy[1]);
      if (x == 0 || y == 0) {
        sb.append("AXIS").append('\n');
      } else if (0 < x && 0 < y) {
        sb.append("Q1").append('\n');
      } else if (x < 0 && 0 < y) {
        sb.append("Q2").append('\n');
      } else if (x < 0 && y < 0) {
        sb.append("Q3").append('\n');
      } else {
        sb.append("Q4").append('\n');
      }
      xy = br.readLine().split(" ");
    }
    sb.append("AXIS").append('\n');
    System.out.print(sb.toString());
  }
}