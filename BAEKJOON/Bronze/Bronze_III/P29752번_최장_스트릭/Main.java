package BAEKJOON.Bronze.Bronze_III.P29752번_최장_스트릭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int max = 0;
    int temp = 0;
    for (int i = 0; i < N; i++) {
      if (input[i] == 0) {
        max = Math.max(max, temp);
        temp = 0;
      } else {
        temp++;
      }
    }
    max = Math.max(max, temp);
    System.out.println(max);
  }
}