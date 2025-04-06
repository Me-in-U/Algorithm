package BAEKJOON.Bronze.Bronze_IV.P15700번_타일_채우기_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println(new BigInteger(input[0]).multiply(new BigInteger(input[1])).divide(new BigInteger("2")));
  }
}