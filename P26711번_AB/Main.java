package P26711번_AB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger b1 = new BigInteger(br.readLine());
    BigInteger b2 = new BigInteger(br.readLine());
    System.out.println(b1.add(b2));
  }
}