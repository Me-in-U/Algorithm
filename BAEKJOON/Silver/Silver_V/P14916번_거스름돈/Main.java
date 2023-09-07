package BAEKJOON.Silver.Silver_V.P14916번_거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int five = n / 5;
    n -= five * 5;
    int two = 0;
    int min = -1;
    while (true) {
      if (n == 0) {
        min = five + two;
        break;
      } else {
        if (n % 2 == 0) {
          two = n / 2;
          n = 0;
        } else {
          if (five == 0) {
            break;
          } else {
            five--;
            two = (n += 5) / 2;
            n -= 2 * two;
          }
        }
      }
    }
    System.out.println(min);
  }
}