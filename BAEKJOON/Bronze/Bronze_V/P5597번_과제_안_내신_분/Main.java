package BAEKJOON.Bronze.Bronze_V.P5597번_과제_안_내신_분;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] sdt = new boolean[30];
    for (int i = 0; i < 28; i++)
      sdt[Integer.parseInt(br.readLine()) - 1] = true;
    for (int i = 0; i < 30; i++)
      if (!sdt[i])
        System.out.println(i + 1);
  }
}