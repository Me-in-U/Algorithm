package BAEKJOON.Bronze.Bronze_IV.P6764번_Sounds_fishy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] ff = new int[4];
    for (int i = 0; i < 4; i++) {
      ff[i] = Integer.parseInt(br.readLine());
    }
    if (ff[0] < ff[1] && ff[1] < ff[2] && ff[2] < ff[3]) {
      System.out.println("Fish Rising");
    } else if (ff[0] > ff[1] && ff[1] > ff[2] && ff[2] > ff[3]) {
      System.out.println("Fish Diving");
    } else if (ff[0] == ff[1] && ff[1] == ff[2] && ff[2] == ff[3]) {
      System.out.println("Fish At Constant Depth");
    } else {
      System.out.println("No Fish");
    }
  }
}