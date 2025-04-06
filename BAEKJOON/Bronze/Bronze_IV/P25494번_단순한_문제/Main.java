package BAEKJOON.Bronze.Bronze_IV.P25494번_단순한_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int count = 0;
      int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int x = 1; x <= inputInt[0]; x++) {
        for (int y = 1; y <= inputInt[1]; y++) {
          for (int z = 1; z <= inputInt[2]; z++) {
            int m1 = x % y;
            int m2 = y % z;
            int m3 = z % x;
            if (m1 == m2 && m2 == m3) {
              count++;
            }
          }
        }
      }
      sb.append(count).append("\n");
    }
    System.out.print(sb);
  }
}
