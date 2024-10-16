package P18330번_Petrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    int result = Math.min(n, 60 + k) * 1500 + Math.max(n - k - 60, 0) * 3000;
    System.out.println(result);
  }
}