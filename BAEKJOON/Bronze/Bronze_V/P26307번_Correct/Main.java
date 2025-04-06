package BAEKJOON.Bronze.Bronze_V.P26307번_Correct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int HH = Integer.parseInt(input[0]);
    int MM = Integer.parseInt(input[1]);
    System.out.println(((HH - 9) * 60) + MM);
  }
}