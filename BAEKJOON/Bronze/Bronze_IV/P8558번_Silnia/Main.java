package P8558번_Silnia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    if (input < 5) {
      int result = 1;
      for (int j = 2; j <= input; j++)
        result *= j;
      System.out.println(result % 10);
    } else {
      System.out.println(0);
    }
  }
}