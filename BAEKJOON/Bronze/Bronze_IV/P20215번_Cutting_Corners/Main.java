package BAEKJOON.Bronze.Bronze_IV.P20215번_Cutting_Corners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    var w = Integer.parseInt(input[0]);
    var h = Integer.parseInt(input[1]);
    var rectangle = w + h;
    var diagonal = Math.sqrt(w * w + h * h);
    System.out.print(rectangle - diagonal);
  }
}