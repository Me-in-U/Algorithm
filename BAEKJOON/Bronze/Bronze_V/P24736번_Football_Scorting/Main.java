package BAEKJOON.Bronze.Bronze_V.P24736번_Football_Scorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int a = Integer.parseInt(line1[0]) * 6 + Integer.parseInt(line1[1]) * 3 +
        Integer.parseInt(line1[2]) * 2 + Integer.parseInt(line1[3]) * 1 + Integer.parseInt(line1[4]) * 2;
    String[] line2 = br.readLine().split(" ");
    int b = Integer.parseInt(line2[0]) * 6 + Integer.parseInt(line2[1]) * 3 +
        Integer.parseInt(line2[2]) * 2 + Integer.parseInt(line2[3]) * 1 + Integer.parseInt(line2[4]) * 2;
    System.out.println(a + " " + b);
  }
}