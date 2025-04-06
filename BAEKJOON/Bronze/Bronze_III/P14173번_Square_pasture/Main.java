package BAEKJOON.Bronze.Bronze_III.P14173번_Square_pasture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input1 = br.readLine().split(" ");
    int x1 = Integer.parseInt(input1[0]);
    int y1 = Integer.parseInt(input1[1]);
    int x2 = Integer.parseInt(input1[2]);
    int y2 = Integer.parseInt(input1[3]);
    String[] input2 = br.readLine().split(" ");
    int x3 = Integer.parseInt(input2[0]);
    int y3 = Integer.parseInt(input2[1]);
    int x4 = Integer.parseInt(input2[2]);
    int y4 = Integer.parseInt(input2[3]);
    System.out
        .println((int) Math.pow(Math.max(Math.max(x4, x2) - Math.min(x3, x1), Math.max(y4, y2) - Math.min(y3, y1)), 2));
  }
}