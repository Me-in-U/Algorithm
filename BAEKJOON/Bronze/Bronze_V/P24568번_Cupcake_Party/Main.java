package BAEKJOON.Bronze.Bronze_V.P24568번_Cupcake_Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int R = Integer.parseInt(br.readLine());
    int S = Integer.parseInt(br.readLine());
    int cakes = R * 8 + S * 3;
    System.out.println(cakes - 28);
  }
}