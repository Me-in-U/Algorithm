package P8718번_Balwanek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int x = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);
    if (7 * k <= x) {
      System.out.println(7000 * k);
    } else if (3.5 * k <= x) {
      System.out.println(3500 * k);
    } else if (1.75 * k <= x) {
      System.out.println(1750 * k);
    } else {
      System.out.println(0);
    }
  }
}