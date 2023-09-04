package BAEKJOON.Bronze.P24183번_Affischutskicket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int C4 = 229 * 324 * input[0] * 2;
    int A3 = 297 * 420 * input[1] * 2;
    int A4 = 210 * 297 * input[2];
    System.out.println((C4 + A3 + A4) * 0.000001);
  }
}