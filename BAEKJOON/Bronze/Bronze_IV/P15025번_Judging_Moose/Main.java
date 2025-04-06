package BAEKJOON.Bronze.Bronze_IV.P15025번_Judging_Moose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if (inputInt[0] == 0 && inputInt[1] == 0) {
      System.out.println("Not a moose");
    } else if (inputInt[0] == inputInt[1]) {
      System.out.println("Even " + (2 * inputInt[0]));
    } else {
      System.out.println("Odd " + (Math.max(inputInt[0], inputInt[1]) * 2));
    }
  }
}