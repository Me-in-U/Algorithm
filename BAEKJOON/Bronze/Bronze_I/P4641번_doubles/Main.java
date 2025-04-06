package BAEKJOON.Bronze.Bronze_I.P4641번_doubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] input = br.readLine().split(" ");
      if (input.length < 2) {
        break;
      }
      boolean[] exists = new boolean[100];
      for (int i = 0; i < input.length; i++) {
        exists[Integer.parseInt(input[i])] = true;
      }
      int count = 0;
      for (int i = 1; i <= 49; i++) {
        if (exists[i] && exists[i * 2]) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
