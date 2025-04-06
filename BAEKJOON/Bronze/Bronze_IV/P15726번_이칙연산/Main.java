package BAEKJOON.Bronze.Bronze_IV.P15726번_이칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double A = Integer.parseInt(st.nextToken());
    double B = Integer.parseInt(st.nextToken());
    double C = Integer.parseInt(st.nextToken());
    System.out.println((int) Math.max(A * B / C, A / B * C));
  }
}