package P26530번_Shipping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());
      double totalPrice = 0.0;
      for (int j = 0; j < x; j++) {
        String[] input = br.readLine().split(" ");
        int quantity = Integer.parseInt(input[1]);
        double price = Double.parseDouble(input[2]);
        totalPrice += price * quantity;
      }
      sb.append("$").append(String.format("%.2f", totalPrice)).append('\n');
    }
    System.out.print(sb.toString());
  }
}