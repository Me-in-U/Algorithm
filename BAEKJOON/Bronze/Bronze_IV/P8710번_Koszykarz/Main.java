package BAEKJOON.Bronze.Bronze_IV.P8710번_Koszykarz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if ((inputInt[1] - inputInt[0]) % inputInt[2] != 0)
      System.out.println((inputInt[1] - inputInt[0]) / inputInt[2] + 1);
    else
      System.out.println((inputInt[1] - inputInt[0]) / inputInt[2]);
  }
}