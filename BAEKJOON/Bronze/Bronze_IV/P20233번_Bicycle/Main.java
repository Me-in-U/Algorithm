package BAEKJOON.Bronze.Bronze_IV.P20233번_Bicycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int T = Integer.parseInt(br.readLine());
    int working_days = 21;
    if (T - 30 < 0)
      System.out.print(a + " ");
    else
      System.out.print(a + working_days * (T - 30) * x + " ");
    if (T - 45 < 0)
      System.out.print(b);
    else
      System.out.println(b + working_days * (T - 45) * y);
  }
}