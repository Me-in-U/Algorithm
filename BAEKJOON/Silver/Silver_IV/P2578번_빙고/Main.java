package BAEKJOON.Silver.Silver_IV.P2578번_빙고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static int[][] bingo;
  protected static int count = 0;
  protected static boolean found = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    bingo = new int[5][5];
    for (int i = 0; i < 5; i++) {
      String[] input = br.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        bingo[i][j] = Integer.parseInt(input[j]);
      }
    }
    for (int i = 0; i < 5; i++) {
      String[] input = br.readLine().split(" ");
      if (!found) {
        for (int j = 0; j < 5; j++) {
          findNumber(Integer.parseInt(input[j]));
          if (getBingGoLines() == 3) {
            found = true;
            break;
          }
        }
      }
    }
    System.out.println(count);
  }

  public static void findNumber(int num) {
    count++;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (bingo[i][j] == num) {
          bingo[i][j] = 0;
          return;
        }
      }
    }
  }

  public static int getBingGoLines() {
    // !가로줄 빙고
    int bingGoLines = 0;
    for (int i = 0; i < 5; i++) {
      boolean isBingo = true;
      for (int j = 0; j < 5; j++) {
        if (bingo[i][j] != 0) {
          isBingo = false;
          break;
        }
      }
      if (isBingo) {
        if (++bingGoLines == 3) {
          return 3;
        }
      }
    }
    // !세로줄 빙고
    for (int i = 0; i < 5; i++) {
      boolean isBingo = true;
      for (int j = 0; j < 5; j++) {
        if (bingo[j][i] != 0) {
          isBingo = false;
          break;
        }
      }
      if (isBingo) {
        if (++bingGoLines == 3) {
          return 3;
        }
      }
    }
    // !대각선 \ 빙고
    if (bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0) {
      if (++bingGoLines == 3) {
        return 3;
      }
    }
    // !대각선 / 빙고
    if (bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0) {
      if (++bingGoLines == 3) {
        return 3;
      }
    }
    return bingGoLines;
  }
}