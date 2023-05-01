package P14623번_감정이입;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String result = "";

    BigInteger a = new BigInteger(br.readLine(), 2);
    BigInteger b = new BigInteger(br.readLine(), 2);
    BigInteger a_b = a.multiply(b);
    BigInteger divider = BigInteger.valueOf(2);
    while (true) {
      String remains = a_b.remainder(divider).toString();
      result += remains;
      a_b = a_b.divide(divider);
      if (a_b.compareTo(BigInteger.valueOf(0)) == 0) {
        break;
      } else if (a_b.compareTo(BigInteger.valueOf(1)) == 0) {
        result += "1";
        break;
      }
    }
    for (int i = result.length() - 1; i >= 0; i--) {
      System.out.print(result.charAt(i) - '0');
    }
  }
}