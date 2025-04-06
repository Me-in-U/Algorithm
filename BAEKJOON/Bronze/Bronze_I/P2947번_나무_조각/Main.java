package BAEKJOON.Bronze.Bronze_I.P2947번_나무_조각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int[] nums;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    nums = new int[5];
    for (int i = 0; i < 5; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }
    while (!check()) {
      if (change1())
        print();
      if (change2())
        print();
      if (change3())
        print();
      if (change4())
        print();
    }
    System.out.print(sb.toString());
  }

  public static boolean change1() {
    if (nums[0] > nums[1]) {
      int big = nums[0];
      nums[0] = nums[1];
      nums[1] = big;
      return true;
    }
    return false;
  }

  public static boolean change2() {
    if (nums[1] > nums[2]) {
      int big = nums[1];
      nums[1] = nums[2];
      nums[2] = big;
      return true;
    }
    return false;
  }

  public static boolean change3() {
    if (nums[2] > nums[3]) {
      int big = nums[2];
      nums[2] = nums[3];
      nums[3] = big;
      return true;
    }
    return false;
  }

  public static boolean change4() {
    if (nums[3] > nums[4]) {
      int big = nums[3];
      nums[3] = nums[4];
      nums[4] = big;
      return true;
    }
    return false;
  }

  public static boolean check() {
    for (int i = 1; i <= 5; i++) {
      if (nums[i - 1] != i) {
        return false;
      }
    }
    return true;
  }

  public static void print() {
    for (int i = 0; i < 5; i++) {
      sb.append(nums[i] + " ");
    }
    sb.append('\n');
  }
}