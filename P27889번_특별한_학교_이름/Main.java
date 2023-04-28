package P27889번_특별한_학교_이름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    if (line.equals("NLCS")) {
      System.out.println("North London Collegiate School");
    } else if (line.equals("BHA")) {
      System.out.println("Branksome Hall Asia");
    } else if (line.equals("KIS")) {
      System.out.println("Korea International School");
    } else if (line.equals("SJA")) {
      System.out.println("St. Johnsbury Academy");
    }
  }
}