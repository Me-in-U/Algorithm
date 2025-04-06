package BAEKJOON.Bronze.Bronze_IV.P25591번_푸앙이와_종윤이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n1 = Integer.parseInt(input[0]);
    int n2 = Integer.parseInt(input[1]);
    int a = 100 - n1;
    int b = 100 - n2;
    int c = 100 - (a + b);
    int d = a * b;
    int q = d / 100;
    int r = d % 100;
    System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
    if (100 <= d) {
      System.out.println(c + q + " " + r);
    } else {
      System.out.println(c + " " + d);
    }
  }
}