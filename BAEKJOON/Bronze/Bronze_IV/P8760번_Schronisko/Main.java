package BAEKJOON.Bronze.Bronze_IV.P8760번_Schronisko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int z = Integer.parseInt(br.readLine());
    for (int i = 0; i < z; i++) {
      String[] input = br.readLine().split(" ");
      System.out.println((Integer.parseInt(input[0]) * Integer.parseInt(input[1])) / 2);
    }
  }
}