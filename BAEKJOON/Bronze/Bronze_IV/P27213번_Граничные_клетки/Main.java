package P27213번_Граничные_клетки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    if (m == 1 && n == 1) {
      System.out.println(1);
    } else if (m == 1 || n == 1) {
      System.out.println(m == 1 ? n : m);
    } else {
      System.out.println(2 * (m + n) - 4);
    }
  }
}