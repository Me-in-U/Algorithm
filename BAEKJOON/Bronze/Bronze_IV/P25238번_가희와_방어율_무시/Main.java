package BAEKJOON.Bronze.Bronze_IV.P25238번_가희와_방어율_무시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    if (100 <= a * ((100 - b) / 100.0)) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }
}