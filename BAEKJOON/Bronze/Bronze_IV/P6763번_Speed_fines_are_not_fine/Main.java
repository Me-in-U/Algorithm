package BAEKJOON.Bronze.Bronze_IV.P6763번_Speed_fines_are_not_fine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int limit = Integer.parseInt(br.readLine());
    int recorded = Integer.parseInt(br.readLine());
    int diff = recorded - limit;
    if (diff <= 0) {
      System.out.println("Congratulations, you are within the speed limit!");
    } else if (1 <= diff && diff <= 20) {
      System.out.println("You are speeding and your fine is $100.");
    } else if (21 <= diff && diff <= 30) {
      System.out.println("You are speeding and your fine is $270.");
    } else if (31 <= diff) {
      System.out.println("You are speeding and your fine is $500.");
    }
  }
}