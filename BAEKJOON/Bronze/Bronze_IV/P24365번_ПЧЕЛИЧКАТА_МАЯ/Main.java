package BAEKJOON.Bronze.Bronze_IV.P24365번_ПЧЕЛИЧКАТА_МАЯ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] abc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(abc[2] - abc[0]);
  }
}