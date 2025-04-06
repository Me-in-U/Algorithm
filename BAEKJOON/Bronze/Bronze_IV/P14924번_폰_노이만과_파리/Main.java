package BAEKJOON.Bronze.Bronze_IV.P14924번_폰_노이만과_파리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println(Integer.parseInt(input[2]) / (Integer.parseInt(input[0]) * 2) * Integer.parseInt(input[1]));
  }
}