package BAEKJOON.Bronze.Bronze_V.P22193번_Multiply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    BigInteger b1 = new BigInteger(br.readLine());
    BigInteger b2 = new BigInteger(br.readLine());
    System.out.println(b1.multiply(b2));
  }
}