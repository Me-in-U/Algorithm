package BAEKJOON.Silver.Silver_V.P2669번_직사각형_네개의_합집합의_면적_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    boolean arr[][] = new boolean[100][100];
    for (int i = 0; i < 4; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      for (int j = x1; j < x2; j++) {
        for (int k = y1; k < y2; k++) {
          arr[j][k] = true;
        }
      }
    }
    int count = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (arr[i][j]) {
          count++;
        }
      }
    }
    System.out.print(count);
  }
}