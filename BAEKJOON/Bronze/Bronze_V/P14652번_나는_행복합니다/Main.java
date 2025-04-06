package BAEKJOON.Bronze.Bronze_V.P14652번_나는_행복합니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int M = Integer.parseInt(input[1]);
    int K = Integer.parseInt(input[2]);
    int x = K / M;
    int y = K % M;
    System.out.println(x + " " + y);
  }
}