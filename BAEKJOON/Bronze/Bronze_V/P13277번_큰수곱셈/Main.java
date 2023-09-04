package P13277번_큰수곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    BigInteger big1 = new BigInteger(input[0]);
    BigInteger big2 = new BigInteger(input[1]);
    System.out.println(big1.multiply(big2));
  }
}