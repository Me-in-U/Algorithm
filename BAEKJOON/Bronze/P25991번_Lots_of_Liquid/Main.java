package BAEKJOON.Bronze.P25991번_Lots_of_Liquid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double totalVolumes = 0.0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      totalVolumes += Math.pow(Double.parseDouble(st.nextToken()), 3);
    }
    System.out.println(Math.cbrt(totalVolumes));
  }
}