package ZeroOne.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      if (line.contains("01") || line.contains("OI")) {
        count++;
      }
    }
    System.out.println(count);
  }
}