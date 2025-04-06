package BAEKJOON.Silver.Silver_V.P1193번_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int L = 1;
    int R = 1;
    int X = Integer.parseInt(br.readLine());
    int count = 1;
    while (count != X) {
      if (R == 1) {
        while (L != 1) {
          L--;
          R++;
          count++;
          if (count == X) {
            break;
          }
        }
        if (count != X) {
          R++;
          count++;
        }
      } else if (L == 1) {
        while (R != 1) {
          L++;
          R--;
          count++;
          if (count == X) {
            break;
          }
        }
        if (count != X) {
          L++;
          count++;
        }
      }
    }
    System.out.println(L + "/" + R);
  }
}