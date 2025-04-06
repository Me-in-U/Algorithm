package BAEKJOON.Bronze.Bronze_III.P2720번_세탁소_사장_동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int C = Integer.parseInt(br.readLine());
      int Quarter = C / 25;
      C -= 25 * Quarter;
      int Dime = C / 10;
      C -= 10 * Dime;
      int Nickel = C / 5;
      C -= 5 * Nickel;
      int Penny = C / 1;
      sb.append(Quarter).append(' ').append(Dime).append(' ').append(Nickel).append(' ').append(Penny).append('\n');
    }
    System.out.print(sb.toString());
  }
}