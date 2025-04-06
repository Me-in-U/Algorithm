package BAEKJOON.Bronze.Bronze_IV.P24356번_ЧАСОВНИК;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int t1 = Integer.parseInt(input[0]);
    int m1 = Integer.parseInt(input[1]);
    int t2 = Integer.parseInt(input[2]);
    int m2 = Integer.parseInt(input[3]);
    int time = ((t2 - t1) * 60) + (m2 - m1);
    if (time < 0) {
      time += 1440;
    }
    System.out.println(time + " " + time / 30);
  }
}