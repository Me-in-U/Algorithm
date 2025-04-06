package BAEKJOON.Bronze.Bronze_V.P28444번_HI_ARC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println((in[0] * in[1]) - (in[2] * in[3] * in[4]));
  }
}