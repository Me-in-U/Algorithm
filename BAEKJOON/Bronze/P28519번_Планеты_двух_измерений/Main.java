package BAEKJOON.Bronze.P28519번_Планеты_двух_измерений;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    System.out.println(Math.min(nm[0] + nm[1], (nm[0] * 2) + 1));
  }
}