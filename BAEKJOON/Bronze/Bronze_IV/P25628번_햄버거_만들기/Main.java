package BAEKJOON.Bronze.Bronze_IV.P25628번_햄버거_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]) / 2;
    int B = Integer.parseInt(input[1]);
    System.out.println(Math.min(A, B));
  }
}