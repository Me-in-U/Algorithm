package BAEKJOON.Bronze.Bronze_V.P18301번_Rats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n1 = Integer.parseInt(input[0]);
    int n2 = Integer.parseInt(input[1]);
    int n12 = Integer.parseInt(input[2]);
    int result =(n1 + 1) * (n2 + 1) / (n12 + 1) - 1;
    System.out.println(result);
  }
}
