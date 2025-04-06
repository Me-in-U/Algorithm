package BAEKJOON.Bronze.Bronze_IV.P13866번_팀_나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println(Math.abs((Integer.parseInt(input[0]) + Integer.parseInt(input[3]))
        - (Integer.parseInt(input[1]) + Integer.parseInt(input[2]))));
  }
}