package P8437번_Julka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger apple = new BigInteger(br.readLine());
    BigInteger diff = new BigInteger(br.readLine());
    BigInteger Klaudia = (apple.add(diff)).divide(new BigInteger("2"));
    BigInteger Natalia = (apple.subtract(diff)).divide(new BigInteger("2"));
    System.out.println(Klaudia.toString());
    System.out.println(Natalia.toString());
  }
}