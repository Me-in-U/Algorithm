package BAEKJOON.Silver.P28136번_원탁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      if (input[i] >= input[i + 1]) {
        count++;
      }
    }
    if (input[0] <= input[N - 1]) {
      count++;
    }
    System.out.println(count);
  }
}