package BAEKJOON.Bronze.Bronze_V.P1271번_엄청난_부자2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    BigInteger n = new BigInteger(input[0]);
    BigInteger m = new BigInteger(input[1]);
    System.out.println(n.divide(m));
    System.out.println(n.remainder(m));
  }
}