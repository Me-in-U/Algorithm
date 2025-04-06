package BAEKJOON.Bronze.Bronze_IV.P10101번_삼각형_외우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] angles = new int[3];
    angles[0] = Integer.parseInt(br.readLine());
    angles[1] = Integer.parseInt(br.readLine());
    angles[2] = Integer.parseInt(br.readLine());
    if ((angles[0] + angles[1] + angles[2]) == 180) {
      if (angles[0] == 60 && angles[1] == 60 && angles[2] == 60) {
        System.out.println("Equilateral");
      } else if (angles[0] == angles[1] || angles[1] == angles[2] || angles[2] == angles[0]) {
        System.out.println("Isosceles");
      } else {
        System.out.println("Scalene");
      }
    } else {
      System.out.println("Error");
    }
  }
}
