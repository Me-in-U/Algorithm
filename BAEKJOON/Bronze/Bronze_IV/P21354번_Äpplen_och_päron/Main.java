package P21354번_Äpplen_och_päron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]);
    int P = Integer.parseInt(input[1]);
    if (A * 7 > P * 13)
      System.out.println("Axel");
    else if (A * 7 < P * 13)
      System.out.println("Petra");
    else
      System.out.println("lika");
  }
}