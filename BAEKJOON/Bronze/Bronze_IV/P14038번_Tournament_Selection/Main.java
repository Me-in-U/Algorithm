package BAEKJOON.Bronze.Bronze_IV.P14038번_Tournament_Selection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int W = 0;
    for (int i = 0; i < 6; i++) {
      if (br.readLine().equals("W")) {
        W++;
      }
    }
    if (W == 5 || W == 6) {
      System.out.println("1");
    } else if (W == 3 || W == 4) {
      System.out.println("2");
    } else if (W == 2 || W == 1) {
      System.out.println("3");
    } else {
      System.out.println("-1");
    }
  }
}