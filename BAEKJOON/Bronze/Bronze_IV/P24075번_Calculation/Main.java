package BAEKJOON.Bronze.Bronze_IV.P24075번_Calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);
    System.out.println(Math.max(A + B, A - B));
    System.out.println(Math.min(A + B, A - B));
  }
}