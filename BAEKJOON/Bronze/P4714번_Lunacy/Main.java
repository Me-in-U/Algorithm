package P4714번_Lunacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double X = 1.0;
    while ((X = Double.parseDouble(br.readLine())) != -1.0) {
      double Y = X * 0.167;
      System.out.println(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.", X, Y));
    }
  }
}