package BAEKJOON.Bronze.Bronze_IV.P8674번_Tabliczka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    BigInteger b1 = new BigInteger(input[0]);
    BigInteger b2 = new BigInteger(input[1]);
    if (b1.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(1)) == 0 &&
        b2.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(1)) == 0) {
      System.out.println(b1.min(b2).toString());
    } else {
      System.out.println(0);
    }
  }
}