package BAEKJOON.Bronze.P6825번_Body_Mass_Index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float weight = Float.parseFloat(br.readLine());
    float height = Float.parseFloat(br.readLine());
    float bmi = weight / (height * height);
    if (bmi > 25) {
      System.out.println("Overweight");
    } else if (18.5 <= bmi && bmi <= 25) {
      System.out.println("Normal weight");
    } else {
      System.out.println("Underweight");
    }
  }
}