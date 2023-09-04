package P20867번_Rulltrappa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    double M = Double.parseDouble(input[0]);
    double S = Double.parseDouble(input[1]);
    double G = Double.parseDouble(input[2]);
    input = br.readLine().split(" ");
    double A = Double.parseDouble(input[0]);
    double B = Double.parseDouble(input[1]);
    input = br.readLine().split(" ");
    int L = Integer.parseInt(input[0]);
    int R = Integer.parseInt(input[1]);
    double friskus = (1 / A) * L + (M / G);
    double latmask = (1 / B) * R + (M / S);
    if (friskus < latmask)
      System.out.println("friskus");
    else
      System.out.println("latmask");
  }
}