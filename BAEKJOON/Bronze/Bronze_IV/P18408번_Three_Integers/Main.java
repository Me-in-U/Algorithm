package BAEKJOON.Bronze.Bronze_IV.P18408번_Three_Integers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] num = new int[2];
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < 3; i++) {
      num[Integer.parseInt(input[i]) - 1]++;
    }
    if (num[0] > num[1]) {
      System.out.println("1");
    } else {
      System.out.println("2");
    }
  }
}