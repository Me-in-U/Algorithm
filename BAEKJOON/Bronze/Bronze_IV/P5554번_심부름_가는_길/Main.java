package BAEKJOON.Bronze.Bronze_IV.P5554번_심부름_가는_길;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int seconds = 0;
    for (int i = 0; i < 4; i++) {
      seconds += Integer.parseInt(br.readLine());
    }
    System.out.println(seconds / 60);
    System.out.println(seconds % 60);
  }
}