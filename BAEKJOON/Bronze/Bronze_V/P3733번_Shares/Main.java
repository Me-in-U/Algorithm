package P3733번_Shares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    while ((input = br.readLine()) != null) {
      String[] split = input.split(" ");
      int N = Integer.parseInt(split[0]);
      int S = Integer.parseInt(split[1]);
      System.out.println(S / (N + 1));
    }
  }
}