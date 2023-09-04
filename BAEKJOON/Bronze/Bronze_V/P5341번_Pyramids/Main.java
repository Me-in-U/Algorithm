package P5341번_Pyramids;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = 0;
    while ((k = Integer.parseInt(br.readLine())) != 0) {
      int count = 0;
      for (int i = 1; i <= k; i++) {
        count += i;
      }
      System.out.println(count);
    }
  }
}