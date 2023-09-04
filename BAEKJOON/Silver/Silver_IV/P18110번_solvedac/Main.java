package BAEKJOON.Silver.P18110번_solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if (n == 0) {
      System.out.println(0);
      return;
    }
    int[] levels = new int[n];
    for (int i = 0; i < n; i++) {
      levels[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(levels);
    int halfCutOffMean = (int) Math.round(n * 0.15);
    int sum = 0;
    for (int i = halfCutOffMean; i < n - halfCutOffMean; i++) {
      sum += levels[i];
    }
    int result = (int) Math.round(sum / (n - (halfCutOffMean * 2.0)));
    System.out.println(result);
  }
}