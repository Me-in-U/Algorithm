package BAEKJOON.Bronze.Bronze_V.P15964번_이상한_기호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] AB = br.readLine().split(" ");
    BigInteger b1 = new BigInteger(AB[0]);
    BigInteger b2 = new BigInteger(AB[1]);
    BigInteger result = (b1.add(b2)).multiply(b1.subtract(b2));
    System.out.println(result.toString());
  }
}