package P16693번_Pizza_Deal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A1 = Integer.parseInt(input[0]);
    int P1 = Integer.parseInt(input[1]);
    input = br.readLine().split(" ");
    int R1 = Integer.parseInt(input[0]);
    int P2 = Integer.parseInt(input[1]);
    double a = (Math.PI * R1 * R1) / P2;
    double s = A1 / (double) P1;
    if (a < s) {
      System.out.println("Slice of pizza");
    } else {
      System.out.println("Whole pizza");
    }
  }
}