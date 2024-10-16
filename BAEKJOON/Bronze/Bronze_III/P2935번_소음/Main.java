package P2935번_소음;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger b1 = new BigInteger(br.readLine());
    char c = br.readLine().charAt(0);
    BigInteger b2 = new BigInteger(br.readLine());
    if (c == '+') {
      System.out.println(b1.add(b2).toString());
    } else {
      System.out.println(b1.multiply(b2).toString());
    }
  }
}