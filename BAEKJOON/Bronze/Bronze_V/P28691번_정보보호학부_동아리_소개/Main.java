package P28691번_정보보호학부_동아리_소개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String c = br.readLine();
    if (c.equals("M")) {
      System.out.println("MatKor");
    } else if (c.equals("W")) {
      System.out.println("WiCys");
    } else if (c.equals("C")) {
      System.out.println("CyKor");
    } else if (c.equals("A")) {
      System.out.println("AlKor");
    } else if (c.equals("$")) {
      System.out.println("$clear");
    }
  }
}