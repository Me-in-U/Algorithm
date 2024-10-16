package P21631번_Checkers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    long a = Long.parseLong(input[0]);
    long b = Long.parseLong(input[1]);
    if (a >= b) {
      System.out.println(b);
    } else {
      System.out.println(a + 1);
    }
  }
}