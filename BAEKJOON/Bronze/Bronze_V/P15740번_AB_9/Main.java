package BAEKJOON.Bronze.Bronze_V.P15740번_AB_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    BigInteger num1 = new BigInteger(input[0]);
    BigInteger num2 = new BigInteger(input[1]);
    System.out.println(num1.add(num2));
  }
}