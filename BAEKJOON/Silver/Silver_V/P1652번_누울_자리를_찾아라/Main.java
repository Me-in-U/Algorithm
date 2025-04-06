package BAEKJOON.Silver.Silver_V.P1652번_누울_자리를_찾아라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    char[][] data = new char[N][N];
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < N; j++) {
        data[i][j] = line.charAt(j);
      }
    }
    int row = 0;
    int col = 0;
    int space = 0;
    // 가로
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (data[i][j] == 'X' && space >= 2) {
          row++;
          space = 0;
        } else if (data[i][j] == '.') {
          space++;
        } else {
          space = 0;
        }
      }
      if (space >= 2) {
        row++;
      }
      space = 0;
    }
    // 세로
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (data[j][i] == 'X' && space >= 2) {
          col++;
          space = 0;
        } else if (data[j][i] == '.') {
          space++;
        } else {
          space = 0;
        }
      }
      if (space >= 2) {
        col++;
      }
      space = 0;
    }
    // 출력
    System.out.println(row + " " + col);
  }
}