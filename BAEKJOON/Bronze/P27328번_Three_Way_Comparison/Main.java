package P27328번_Three_Way_Comparison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    if (a < b) {
      System.out.println(-1);
    } else if (a == b) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }
}