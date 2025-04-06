package BAEKJOON.Bronze.Bronze_IV.P8723번_Patyki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if (inputInt[0] == inputInt[1] && inputInt[1] == inputInt[2])
      System.out.println(2);
    else if (inputInt[0] * inputInt[0] + inputInt[1] * inputInt[1] == inputInt[2] * inputInt[2]
        || inputInt[1] * inputInt[1] + inputInt[2] * inputInt[2] == inputInt[0] * inputInt[0]
        || inputInt[0] * inputInt[0] + inputInt[2] * inputInt[2] == inputInt[1] * inputInt[1])
      System.out.println(1);
    else
      System.out.println(0);
  }
}