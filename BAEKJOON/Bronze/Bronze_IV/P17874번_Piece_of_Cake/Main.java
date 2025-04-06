package BAEKJOON.Bronze.Bronze_IV.P17874번_Piece_of_Cake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(Math.max(input[0] - input[1], input[1]) * Math.max(input[0] - input[2], input[2]) * 4);
  }
}
