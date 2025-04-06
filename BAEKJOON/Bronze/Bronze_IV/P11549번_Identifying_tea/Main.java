package BAEKJOON.Bronze.Bronze_IV.P11549번_Identifying_tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    int count = 0;
    for (int i = 0; i < 5; i++)
      if (T == Integer.parseInt(input[i]))
        count++;
    System.out.println(count);
  }
}