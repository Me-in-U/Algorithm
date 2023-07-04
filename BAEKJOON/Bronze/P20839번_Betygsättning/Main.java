package BAEKJOON.Bronze.P20839번_Betygsättning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int x = Integer.parseInt(input[0]);
    int y = Integer.parseInt(input[1]);
    int z = Integer.parseInt(input[2]);
    input = br.readLine().split(" ");
    int xp = Integer.parseInt(input[0]);
    int yp = Integer.parseInt(input[1]);
    int zp = Integer.parseInt(input[2]);
    if (z <= zp && y <= yp && x <= xp) {
      System.out.println("A");
    } else if (z <= zp && y <= yp && x <= xp * 2) {
      System.out.println("B");
    } else if (z <= zp && y <= yp) {
      System.out.println("C");
    } else if (z <= zp && y <= yp * 2) {
      System.out.println("D");
    } else {
      System.out.println("E");
    }
  }
}