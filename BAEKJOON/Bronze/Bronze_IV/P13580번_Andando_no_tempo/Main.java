package BAEKJOON.Bronze.Bronze_IV.P13580번_Andando_no_tempo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    if (input[0] == input[1] || input[1] == input[2] || input[0] + input[1] == input[2]) {
      System.out.println("S");
    } else {
      System.out.println("N");
    }
  }
}