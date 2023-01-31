package P15873번_공백없는;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    if (input.length() == 2) {
      System.out.println(Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(1, 2)));
    } else if (input.length() == 3) {
      int a = Integer.parseInt(input.substring(0, 2));
      if (a == 10) {
        System.out.print(10 + Integer.parseInt(input.substring(2, 3)));
      } else {
        System.out.print(Integer.parseInt(input.substring(0, 1)) + 10);
      }
    } else if (input.length() == 4) {
      System.out.println("20");
    }
  }
}