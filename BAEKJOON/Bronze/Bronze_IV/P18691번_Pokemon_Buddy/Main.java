package BAEKJOON.Bronze.P18691번_Pokemon_Buddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int G = Integer.parseInt(st.nextToken()); // group of the Pokemon
      int C = Integer.parseInt(st.nextToken()); // initial candies
      int E = Integer.parseInt(st.nextToken()); // candies required to evolve
      if (C >= E) {
        System.out.println(0);
      } else {
        int kilo = 0;
        if (G == 1) {
          kilo = E - C;
        } else if (G == 2) {
          kilo = (E - C) * 3;
        } else {
          kilo = (E - C) * 5;
        }
        System.out.println(kilo);
      }
    }
  }
}