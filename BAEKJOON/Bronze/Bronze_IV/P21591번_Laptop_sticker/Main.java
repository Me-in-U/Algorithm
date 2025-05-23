package BAEKJOON.Bronze.Bronze_IV.P21591번_Laptop_sticker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    input[0] -= 2;
    input[1] -= 2;
    if (input[0] >= input[2] && input[1] >= input[3]) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}