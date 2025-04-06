package BAEKJOON.Bronze.Bronze_IV.P28808번_Таблица_результатов;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().split(" ")[0]);
    int count = 0;
    for (int i = 0; i < n; i++)
      if (br.readLine().contains("+"))
        count++;
    System.out.println(count);
  }
}