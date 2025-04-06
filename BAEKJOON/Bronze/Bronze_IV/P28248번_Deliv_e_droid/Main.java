package BAEKJOON.Bronze.Bronze_IV.P28248번_Deliv_e_droid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int P = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int F = P > C ? (P * 50) - (C * 10) + 500 : (P * 50) - (C * 10);
    System.out.println(F);
  }
}
