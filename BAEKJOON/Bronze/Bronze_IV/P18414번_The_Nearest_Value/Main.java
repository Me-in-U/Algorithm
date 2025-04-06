package BAEKJOON.Bronze.Bronze_IV.P18414번_The_Nearest_Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if (input[0] >= input[2]) {
      System.out.println(input[2]);
    } else if (input[1] <= input[0] && input[0] <= input[2]) {
      System.out.println(input[0]);
    } else {
      System.out.println(input[1]);
    }
  }
}
