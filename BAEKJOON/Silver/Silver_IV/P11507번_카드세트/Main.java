package BAEKJOON.Silver.Silver_IV.P11507번_카드세트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean dup = false;
    // P[0][] K[1][] H[2][] T[3][]
    boolean[][] card = new boolean[4][13];

    // 입력
    String str = br.readLine();
    for (int i = 0; i < str.length() - 1; i += 3) {
      int shape = -1;
      char a = str.charAt(i);
      int num = Integer.parseInt(str.substring(i + 1, i + 3));

      if (a == 'P') {
        shape = 0;
      } else if (a == 'K') {
        shape = 1;
      } else if (a == 'H') {
        shape = 2;
      } else if (a == 'T') {
        shape = 3;
      }
      if (!card[shape][num - 1]) {
        card[shape][num - 1] = true;
      } else {
        dup = true;
        break;
      }
    }

    // 출력
    if (dup) {
      System.out.println("GRESKA");
    } else {
      for (int i = 0; i < 4; i++) {
        int sum = 0;
        for (int k = 0; k < 13; k++) {
          if (!card[i][k]) {
            sum++;
          }
        }
        System.out.print(sum + " ");
      }
    }
  }
}