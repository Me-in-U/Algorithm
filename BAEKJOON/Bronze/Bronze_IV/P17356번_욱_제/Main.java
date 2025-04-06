package BAEKJOON.Bronze.Bronze_IV.P17356번_욱_제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);
    double M = (B - A) / 400.0;
    double result = 1 / (1 + Math.pow(10, M));
    System.out.println(result);
  }
}