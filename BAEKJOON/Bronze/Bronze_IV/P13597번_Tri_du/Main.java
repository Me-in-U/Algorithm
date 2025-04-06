package BAEKJOON.Bronze.Bronze_IV.P13597번_Tri_du;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int c1 = Integer.parseInt(input[0]);
    int c2 = Integer.parseInt(input[1]);
    if (c1 == c2) {
      System.out.println(c1);
    } else {
      System.out.println(Math.max(c1, c2));
    }
  }
}