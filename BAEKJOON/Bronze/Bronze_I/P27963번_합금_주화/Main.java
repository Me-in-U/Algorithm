package BAEKJOON.Bronze.Bronze_I.P27963번_합금_주화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] lines = br.readLine().split(" ");
    double d1 = Double.parseDouble(lines[0]);
    double d2 = Double.parseDouble(lines[1]);
    double x = Double.parseDouble(lines[2]);
    if (d1 > d2) {
      double temp = d1;
      d1 = d2;
      d2 = temp;
    }
    double d1_mass = d2 * (1 - x / 100);
    double d2_mass = d2 * (x / 100);
    double d1_volume = d1_mass / d1;
    double d2_volume = d2_mass / d2;
    System.out.println((d1_mass + d2_mass) / (d1_volume + d2_volume));
  }
}