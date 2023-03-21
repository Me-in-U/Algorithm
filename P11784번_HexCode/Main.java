package P11784번_HexCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = "";
    while ((line = br.readLine()) != null) {
      String[] hexPairs = line.split("(?<=\\G.{2})"); // split the line into pairs of hex digits
      byte[] bytes = new byte[hexPairs.length];
      for (int i = 0; i < hexPairs.length; i++) {
        bytes[i] = (byte) Integer.parseInt(hexPairs[i], 16); // parse each pair of hex digits as a byte
      }
      System.out.println(new String(bytes));
    }
  }
}