package P2592번_대표값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int[] num;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    num = new int[101];
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      int input = Integer.parseInt(br.readLine());
      num[input / 10]++;
      sum += input;
    }
    System.out.println((sum / 10) + "\n" + findmost());
  }

  public static int findmost() {
    int max = 0;
    int most = 0;
    for (int i = 1; i < 101; i++) {
      if (num[i] > max) {
        max = num[i];
        most = i;
      }
    }
    return most * 10;
  }
}