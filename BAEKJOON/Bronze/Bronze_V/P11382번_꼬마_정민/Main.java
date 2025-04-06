package BAEKJOON.Bronze.Bronze_V.P11382번_꼬마_정민;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nums = br.readLine().split(" ");
    long sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += Long.parseLong(nums[i]);
    }
    System.out.println(sum);
  }
}