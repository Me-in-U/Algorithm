package BAEKJOON.Bronze.Bronze_IV.P14470번_전자레인지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int time = 0;
    int[] ABCDE = new int[5];
    for (int i = 0; i < 5; i++) {
      ABCDE[i] = Integer.parseInt(br.readLine());
    }
    while (ABCDE[0] != ABCDE[1]) {
      if (ABCDE[0] < 0) {
        time += ABCDE[0] * -1 * ABCDE[2];
        ABCDE[0] = 0;
      } else if (ABCDE[0] == 0) {
        time += ABCDE[3];
        ABCDE[0] = 0;
        if (ABCDE[0] != ABCDE[1]) {
          time += ABCDE[4];
          ABCDE[0] = 1;
        }
      } else {
        time += ABCDE[4] * (ABCDE[1] - ABCDE[0]);
        ABCDE[0] = ABCDE[1];
      }
    }
    System.out.print(time);
  }
}