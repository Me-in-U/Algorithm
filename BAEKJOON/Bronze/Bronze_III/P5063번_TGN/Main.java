package BAEKJOON.Bronze.Bronze_III.P5063번_TGN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int[] REC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if (REC[0] < REC[1] - REC[2]) {
        sb.append("advertise").append('\n');
      } else if (REC[0] > REC[1] - REC[2]) {
        sb.append("do not advertise").append('\n');
      } else {
        sb.append("does not matter").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}