package BAEKJOON.Bronze.Bronze_IV.P30067번_Paslėpta_suma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] nums = new int[10];
    for (int i = 0; i < 10; i++) {
      nums[i] = Integer.parseInt(br.readLine());
    }
    for (int i = 0; i < 10; i++) {
      int selected = i;
      int sum = 0;
      for (int j = 0; j < 10; j++) {
        if (j != selected) {
          sum += nums[j];
        }
      }
      if (sum == nums[selected]) {
        System.out.println(nums[selected]);
        break;
      }
    }
  }
}