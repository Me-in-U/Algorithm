package P13985번_Equality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    if ((line.charAt(0) - '0') + (line.charAt(4) - '0') == (line.charAt(8) - '0')) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}