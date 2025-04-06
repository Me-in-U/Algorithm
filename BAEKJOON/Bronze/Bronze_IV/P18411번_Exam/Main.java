package BAEKJOON.Bronze.Bronze_IV.P18411번_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputStr = br.readLine().split(" ");
    int[] inputInt = Arrays.stream(inputStr).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(inputInt);
    System.out.println(inputInt[1] + inputInt[2]);
  }
}