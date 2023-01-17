package P10768번_특별한_날;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int D = 0;
    if (M == 2) {
      D = Integer.parseInt(br.readLine());
      if (D == 18) {
        System.out.println("Special");
      } else if (D > 18) {
        System.out.println("After");
      } else if (D < 18) {
        System.out.println("Before");
      }
    } else if (M > 2) {
      D = Integer.parseInt(br.readLine());
      System.out.println("After");
    } else {
      D = Integer.parseInt(br.readLine());
      System.out.println("Before");
    }
  }
}