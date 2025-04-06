package BAEKJOON.Bronze.Bronze_IV.P11257번_IT_Passport_Examination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int sum = input[1] + input[2] + input[3];
      sb.append(input[0]).append(" ").append(sum).append(" ");
      if (55 <= sum && 11 <= input[1] && 8 <= input[2] && 12 <= input[3]) {
        sb.append("PASS").append('\n');
      } else {
        sb.append("FAIL").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}