package BAEKJOON.Bronze.Bronze_IV.P25784번_Easy_to_Solve_Expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if ((nums[0] + nums[1] == nums[2]) || (nums[1] + nums[2] == nums[0]) || (nums[0] + nums[2] == nums[1])) {
      System.out.println("1");
    } else if ((nums[0] * nums[1] == nums[2]) || (nums[1] * nums[2] == nums[0]) || (nums[0] * nums[2] == nums[1])) {
      System.out.println("2");
    } else {
      System.out.println("3");
    }
  }
}