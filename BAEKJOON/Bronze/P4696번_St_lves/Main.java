package P4696번_St_lves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double data = 0;
    while ((data = Double.parseDouble(br.readLine())) != 0) {
      System.out.printf("%.2f%n", 1 + data + Math.pow(data, 2) + Math.pow(data, 3) + Math.pow(data, 4));
    }
  }
}